public class Prog1 {
    public static void main(String args[])
    {
        Long a = 50L;
        Long b = 70L;
        if ( a % 2 == 0 ) {
            System.out.println(a+b);
        }
        if ( b % 2 == 0 ) {
            System.out.println(a-b);
        }
        if ( a > 0 ) {
            System.out.println(a*b);
        }
        if ( b > 0 ) {
            System.out.println(a/b);
        }

    }
}
