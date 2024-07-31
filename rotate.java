
import java.util.Scanner;

public class rotate {


    static void  printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    /**
     * @param arr
     * @param k
     * @return
     */
    static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j=0;

        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Enter k : ");
        int k = sc.nextInt();

        System.out.println("Original Array : ");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println(" ");
        System.out.println("Array after Rotation : ");

        printArray(ans);
    }
}
