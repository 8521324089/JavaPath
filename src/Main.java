////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static int factorial(int i) throws InterruptedException {
//        Thread.sleep(100);
//        if(i ==0)return 1;
//        return i*factorial(i-1);
//    }
//    public static void main(String[] args) throws InterruptedException {
//        long startTime=System.currentTimeMillis();
//        //System.out.println(startTime);
//        Thread[] temp=new Thread[10];
//        for (int i = 0; i < 10; i++) {
//            int finalI = i;
//            temp[i]=new Thread(()->{
//                try {
//                    System.out.println(factorial(finalI));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            temp[i].start();
//        }
//        for(Thread th:temp){
//            th.join();
//        }
//        System.out.println(System.currentTimeMillis()-startTime);
//    }
//}
///dggfdc