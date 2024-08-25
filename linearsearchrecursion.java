public class linearsearchrecursion {
    
    static boolean search(int[] a,int target,int n,int idx){
        //base case
        if(idx >= n){
            return false;
        }

        //selfwork
        if(a[idx] == target){
            return true;
        }

        //recursive work
        if(search(a, target, n, idx+1)){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,6};
        int target = 4;
        if(search(a, target,a.length, 0)){
            System.out.println("Present");
        } else{
            System.out.println("Not Present");
        }
    }

}
