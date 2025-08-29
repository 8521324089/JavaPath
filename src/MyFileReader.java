//package MyThread.src;
//
//import java.io.*;
//
//public class MyFileReader {
//    public static void main(String[] args) throws FileNotFoundException {
//        try(FileReader fr=new FileReader("MyThread/src/file.txt")){
//            int a;
//            while((a=fr.read())!=-1)
//                System.out.println((char)a);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            throw new FileNotFoundException();
//        }
////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////        br.readLine();
//    }
//}
