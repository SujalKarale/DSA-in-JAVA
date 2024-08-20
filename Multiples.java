import java.util.Scanner;

public class Multiples {
    
    static void printMultiples(int n,int k){
        if(k==1){
            System.out.print(n);
            return;
        }
        
        printMultiples(n,k-1);

        System.out.print(" "+n*k+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter k :");
        int k = sc.nextInt();
        System.out.println("Multiples :");
        printMultiples(n, k);
    }
}
