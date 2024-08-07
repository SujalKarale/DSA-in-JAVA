
import java.util.Scanner;

public class Multidimensionalarray{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        System.out.println("Enter elements in array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            Scanner sc = new Scanner(System.in);
             arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(" " + arr[i][j]);
            }
        }
    }
}