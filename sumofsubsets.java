public class sumofsubsets {
    
    static void subsetSum(int[] a, int n, int idx, int sum){
        if(idx >= n){
            System.out.print(sum+" ");
            return;
        }
        // curr idx + sum
        subsetSum(a, n, idx+1, sum+a[idx]);
        // curr ans
        subsetSum(a, n, idx+1, sum);
    }

    public static void main(String[] args) {
        
        int[] a = {2,4,5};
        subsetSum(a, a.length, 0, 0);
    }
}
