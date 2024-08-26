import java.util.Scanner;

public class removeoccurrences {
    
    static String removeA(String s, int idx){
        // base case
        if(idx == s.length()) return "";


        // recursive work
        String smallAns = removeA(s, idx+1);
        char currChar = s.charAt(idx);

        // self work
        if(currChar != 'a'){
            return currChar + smallAns;
        } else{
            return smallAns;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
    }
}
