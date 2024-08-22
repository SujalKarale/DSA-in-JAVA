public class arrayrecursion {
    
    static void printArray(int[] arr,int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");

        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        System.out.println("Array : ");
        printArray(arr, 0);
    }
}
