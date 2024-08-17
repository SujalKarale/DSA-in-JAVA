import java.util.Scanner;

public class ntoone {
    static int printDecreasing(int n){
        if(n==1){
            System.out.print("1 ");
            return 1;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Decreasing order :");
        printDecreasing(n);
    }
} 
