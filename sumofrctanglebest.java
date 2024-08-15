import java.util.Scanner;

public class sumofrctanglebest {
    

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // matrix[i][j] = sumRectangle((0,0) (i,j))

        for (int i = 0; i < r; i++) {
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int ans = 0;
        findPrefixSumMatrix(matrix);
        int sum=0,up=0,left=0,leftUp=0;

        sum = matrix[l2][r2];
        if(r1>=1)
        left = matrix[l2][r1-1];
        if(l1>=1)
        up = matrix[l1-1][r2];
        if(l1>=1 && r1>=1)
        leftUp = matrix[l1-1][r1-1];

        ans= sum-up-left+leftUp;

        return ans;
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter "+totalElements+" values");  
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt(); 

        System.out.println("Rectangle Sum "+findSum(matrix, l1, r1, l2, r2));
    }
}
