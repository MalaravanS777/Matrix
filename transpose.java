import java.util.Scanner;
public class transpose{
	public static void main(String args[]){
		int r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		r=s.nextInt();
		System.out.println("Enter the no of columns:");
		c=s.nextInt();
		int matrix[][]=new int[r][c];
		int matrix1[][]=new int[c][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j]=s.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix1[j][i]=matrix[i][j];
			}
		}
		for(int i=0;i<c;i++){
			for(int j=0;j<r;j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
	}
}