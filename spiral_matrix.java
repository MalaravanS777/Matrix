import java.util.Scanner;
class spiral_matrix {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        r=sc.nextInt();
        System.out.println("Enter the colm:");
        c=sc.nextInt();
        int matrix[][]=new int[r][c]; 
        int top=0,bottom=c-1,left=0,right=r-1;
        System.out.println("Enter the values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
                
            }
            System.out.println();
        }
        System.out.println("Printing the matrix in spiral way:");
        while(top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    System.out.print(matrix[top][i]+" ");
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    System.out.print(matrix[right][i]+" ");
                }
                right--;
                if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        System.out.print(matrix[bottom][i]+" ");
                    }
                    bottom--;
                }
                
                if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(matrix[left][i]+" ");
                    }
                    left++;
                }
                
        }
    }
}
