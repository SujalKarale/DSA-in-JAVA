
import java.util.Scanner;

public class countofdigits {

    static int cod(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int ans = cod(n/10)+1;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Count of digit is : "+cod(n));
    }
}
