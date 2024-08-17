import java.util.Scanner;

public class factorial {
    
    static int fact(int n){
       
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        fact(n);
        System.out.println("Factorial is : "+fact(n));
    }
}
  