import java.util.Scanner;

public class fibonacci {
    
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev = fib(n-1);
        int prePrev = fib(n-2);

        return prev + prePrev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
