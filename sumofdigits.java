
import java.util.Scanner;

public class sumofdigits {
    
    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallAns = sod(n/10);

        int ans = smallAns + n%10;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digit is : "+sod(n));
    }
}
