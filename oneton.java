import java.util.*;
public class oneton {

    static int printIncreasing(int n){
        if(n==1){
            System.out.print("1 ");
            return 1;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Increasing order:");
        printIncreasing(n);
    }
}