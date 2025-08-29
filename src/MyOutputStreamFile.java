//package MyThread.src;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//
//public class MyOutputStreamFile {
//    public static void main(String[] args) throws IOException {
////        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
////            osw.write("vivek");
////            osw.write(12);
////            char[] arr="hello this ".toCharArray();
////            osw.write(arr);
////        }catch(IOException e){
////            System.out.println(e.getMessage());
////        }
//
//        try(FileWriter fw=new FileWriter("MyThread/src/file.txt",true)){
//            fw.write("today i learn file writing");
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr=new FileReader("MyThread/src/file.txt")){
//            int a;
//            while((a=fr.read())!=-1)
//                System.out.print((char)a);
//        }catch (IOException b){
//            System.out.print(b.getMessage());
//        }
//    }
//}
