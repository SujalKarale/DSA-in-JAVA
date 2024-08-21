
import java.util.Scanner;

public class gcd {
    
    static int igcd(int x,int y){
        if(y != 0) return x;
        return igcd(y,x%y);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        int gcd = igcd(x, y);
        System.out.println("The GCD of "+x+" & "+y+" is : "+gcd);
        int lcm = (x*y)/gcd;
        System.out.println("The LCM of "+x+" & "+y+" is : "+lcm);
    }
}
