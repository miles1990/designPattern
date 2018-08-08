package file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        CopyFile a2 = new CopyFile();

        //电脑d盘中的cat.png 图片的路径
        String filePath1 = "E:/20180730130415.jpg";

        //电脑e盘中的cat.png 图片的路径
        String filePath2 = "E:/BaiduNetdiskDownload/20180730130415.jpg";

        //复制文件
        a2.copyFile( filePath1 , filePath2 );

    }

    /**
     * 文件复制
     * @param filePath_old : 需要复制文件的路径
     * @param filePath_new : 复制文件存放的路径
     */
    public void copyFile( String filePath_old  , String filePath_new){
        FileInputStream fis=null ;
        FileOutputStream fout = null ;
        try {
            // 根据path路径实例化一个输入流的对象
            fis  = new FileInputStream( filePath_old );

            //2. 返回这个输入流中可以被读的剩下的bytes字节的估计值；
            int size =  fis.available() ;
            //3. 根据输入流中的字节数创建byte数组；
            byte[] array = new byte[size];
            //4.把数据读取到数组中；
            fis.read( array ) ;

            //5、根据文件路径创建输出流
            fout = new FileOutputStream( filePath_new ) ;

            //5、把byte数组输出；
            fout.write( array );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if ( fout != null ) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
