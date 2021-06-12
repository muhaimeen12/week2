package week2;

public class AddMatrics {
	public static void main(String[] args) {
		int[][] a= {{2,3,5},{4,7,8},{4,8,0}};
		int[][] b= {{3,5,6},{4,9,7},{0,4,5}};
		int[][] z=new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				z[i][j]=a[i][j]+b[i][j];
				System.out.println(z[i][j]+"  ");
			}
			System.out.print("\n");
		}

}
}
