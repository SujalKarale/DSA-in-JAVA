public class sortzeroesandones {

    static void sortZero(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i=0;i<n;i++){
            
            if(arr[i]==0){
                count++;
            }
        }

        for(int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1};
        sortZero(arr);
        System.out.println("Sorted Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
