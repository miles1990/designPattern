package Composite;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Folder rootFolder=new Folder("c:");

        Folder myGit=new Folder("myGit");
        File design=new File("design.java");
        rootFolder.add(myGit);
        rootFolder.add(design);

        Folder myGit2=new Folder("myGit2");
        File design2=new File("design2.java");
        myGit.add(myGit2);
        myGit.add(design2);

        displayTree(rootFolder,0);
    }

    public static void displayTree(IFile rootFilder,int deep){
        for (int i=0;i<deep;i++){
            System.out.print("--");
        }
        //显示自身名称
        rootFilder.display();
        //获得子树
        List<IFile> children=rootFilder.getChild();
        //遍历子树
        for(IFile file:children){
            if(file instanceof File){
                for (int i=0;i<=deep;i++){
                    System.out.print("--");
                }
                file.display();
            }else{
                displayTree(file,deep+1);
            }
        }
    }
}
