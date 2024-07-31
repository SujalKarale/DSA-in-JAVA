public class swap {

    static void swapNum(int a,int b){
        System.out.println("Original values before swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int temp = a;
        a = b;
        b = temp ;

        System.out.println("Original values After swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapNum(a, b);
    }
}
