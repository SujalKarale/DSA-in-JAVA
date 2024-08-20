import java.util.Scanner;

public class Seriessum {
    
    static int seriesSum(int n){
        if(n==0){
            return 0;
        }
        return seriesSum(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
