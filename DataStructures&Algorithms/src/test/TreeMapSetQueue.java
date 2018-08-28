package test;

import java.util.*;

public class TreeMapSetQueue {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45, 23, 12, 88, 5, 16);
        NavigableSet<Integer> nset = new TreeSet<Integer>(list);
        System.out.println(nset);

        for (Iterator<Integer> itr = nset.descendingIterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        System.out.println(nset.first() + "\t" + nset.last());
        //---lower than 88 and most closed
        System.out.println(nset.lower(88));
        //--- <=
        System.out.println(nset.floor(88));
        //--- >
        System.out.println(nset.higher(56));
        //---- >=
        System.out.println(nset.ceiling(45));
        System.out.println("=============");

        NavigableMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        map.put(56, 91);
        map.put(8, 22);
        map.put(86, 3);
        map.put(22, 88);

        System.out.println(map.ceilingKey(56));
        //返回与大于或等于给定键的最小键相关联的键值映射，如果没有此键，则 null 。
        System.out.println(map.ceilingEntry(56));

        //返回与该地图中的最小键相关联的键值映射，如果地图为空，则返回 null 。
        System.out.println(map.firstKey() + "\t" + map.firstEntry());

        System.out.println("Before pollFrist==>");
        System.out.println(map);
        //删除并返回与该地图中的最小键相关联的键值映射，如果地图为空，则返回 null 。
        map.pollFirstEntry();
        System.out.println("After==>" + map + "\n");

        //-----set
        System.out.println(nset);
        nset.pollFirst();
        System.out.println(nset + "\n" + "=====================");

        //---queue linkedlist 实现了 queue 和 list interface
        Queue<String> queue = new LinkedList<String>();
        queue.offer("star");
        queue.offer("tmac");
        queue.offer("kobe");
        System.out.println(queue.size() + "\t" + queue);
        //head element
        System.out.println(queue.peek() + "\t" + queue);
        //get the head element and delete
        System.out.println(queue.poll() + "\t" + queue);
        //--note: 避免使用add remove elment 方法
        //----Deque 双端队列

        Deque<String> ld = new LinkedList<String>();
        //由数组实现
        Deque<Integer> ad = new ArrayDeque<Integer>();

        //---ld
        ld.offer("kobe");
        ld.offerFirst("frist");
        ld.offerLast("last");
        System.out.println(ld);
        ld.pollFirst();
        System.out.println(ld);
        System.out.println(ld.peekFirst());
        ld.removeFirstOccurrence("kobe");
        System.out.println(ld);

        //---------pirorityQueue
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<GregorianCalendar>();
        pq.offer(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        pq.offer(new GregorianCalendar(1902, Calendar.JULY, 9));
        pq.offer(new GregorianCalendar(1916, Calendar.DECEMBER, 7));
        pq.offer(new GregorianCalendar(2206, Calendar.JUNE, 9));

        for (GregorianCalendar date : pq) {
            System.out.println(date.get(Calendar.YEAR));
        }
        System.out.println("===========");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().get(Calendar.YEAR));
        }
    }
}
