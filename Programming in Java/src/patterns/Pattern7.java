package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
	
//		int k=1;
//		int rows=85 ;
//		int s=1;
//		int t=101;
//		int f=202;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				if(k<=9) {
//				System.out.print(k+" ");
//				k++;
//			}else if(k>=10 && k<=18) {
//				System.out.print(s*11+" ");
//				s++;
//				k++;
//			}
//			else if(k>=18 && k<=28) {
//				System.out.print(t+" ");
//				k++;
//				t=t+10;
//			}
//			else {
//				System.out.print(f+" ");
//				f=f+10;
//			}
//			}
//			System.out.println();
		
		
		
		
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 

		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		
//		A B C D E 
//		B       C 
//		C       D 
//		D       E 
//		E F G H I 
		
		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			int k=i;
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows) {
//					System.out.print((char)(k+64)+" ");
//					k++;
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		A B C D E 
//		B       F 
//		C       G 
//		D       H 
//		E F G H I 
		
		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			int k=i;
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows) {
//					System.out.print((char)(k+64)+" ");
//					k++;
//				}
//				else {
//					System.out.print(" "+" ");
//					k++;
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		* * * * * 
//		* *     * 
//		*   *   * 
//		*     * * 
//		* * * * * 
		
		
		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows || i==j) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		* * * * * 
//		* *   * * 
//		*   *   * 
//		* *   * * 
//		* * * * * 
		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows || i==j || i+j==rows+1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		* * * * * * * * * 
//		* *           * * 
//		*   *       *   * 
//		*     *   *     * 
//		* * * * * * * * * 
//		*     *   *     * 
//		*   *       *   * 
//		* *           * * 
//		* * * * * * * * * 
		
		
//		int rows=9;    // CODE WORKS FOE ONLY ODD ROWS
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows || i==j || i+j==rows+1 || i==((rows/2)+1)) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		* * * * * * * * * 
//		* *     *     * * 
//		*   *   *   *   * 
//		*     * * *     * 
//		* * * * * * * * * 
//		*     * * *     * 
//		*   *   *   *   * 
//		* *     *     * * 
//		* * * * * * * * * 
		
//		int rows=9;    // CODE WORKS FOE ONLY ODD ROWS
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows || j==1 || j==rows || i==j || i+j==rows+1 || i==((rows/2)+1) || j==((rows/2)+1)) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
//		  * *   * *   
//		  *     *     * 
//		  *           * 
//		    *       *   
//		      *   *     
//		        *       

		
//		int rows=6;
//		int cols=7;
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				if((i==1 && j%3==0 ) || (i==0 && j%3!=0) || (i-j==2) || (i+j==8)){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		int rows=6;
		int cols=7;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if((i==1 && j%3==0 ) || (i==0 && j%3!=0) || (i-j==2) || (i+j==8)){
					System.out.print("* ");
				}
				else if(i==2&&j==2) {
					System.out.print("R ");
				}
				else if(i==2&&j==3) {
					System.out.print("C ");
				}
				else if(i==2&&j==4) {
					System.out.print("B ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
			
} 
}
