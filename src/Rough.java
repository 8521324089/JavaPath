package MyThread.src;

public class Rough {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(130);
        Integer b=a;
        System.out.println(a==b);

        Integer c = 130;
        Integer d = 130;
        System.out.println(c == d);       // false
        System.out.println(c.equals(d));  // true
        Object obj=new Object();
        System.out.println(obj.equals(obj));

    }
}
