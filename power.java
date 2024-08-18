
import java.util.Scanner;

public class power {
    
    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        return pow(p,q-1)*p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p : ");
        int p = sc.nextInt();
        System.out.print("Enter q : ");
        int q = sc.nextInt();
        System.out.println(p+" raise to the power "+q+" = "+pow(p, q));
    }
}
