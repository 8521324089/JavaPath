//public class MyEnumGenericMain {
//    enum Operation{
//        ADD,MUL,DIV,SUB,OTH;
//
//        public <T extends Number> double fun(T a, T b){
//            switch (this){
//                case ADD -> {
//                    return (double)a+(double)b;
//                }
//                case MUL -> {
//                    return (double) a*(double) b;
//                }
//                case DIV -> {
//                    return (double) a/(double) b;
//                }
//                case SUB -> {
//                    return (double) a-(double) b;
//                }
//                 default -> {
//                    return 0;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Operation.ADD.fun(2.0,6.0));
//        System.out.println(Operation.SUB.fun(7.0,5.0));
//        System.out.println(Operation.OTH.fun(7.0,5.0));
//    }
//}
