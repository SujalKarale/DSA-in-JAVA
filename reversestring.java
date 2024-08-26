import java.util.Scanner;

public class reversestring {
    
    static String reverseString(String s,int idx){
        // base case
        if(idx == s.length()){
            return "";
        }

        // recursive work
        String reverse = reverseString(s, idx+1);
        return reverse + s.charAt(idx);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.print("Reversed String : "+reverseString(s, 0));

    }
}
