package Patterns;

public class Print_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)/2||i==n-1||j==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
