package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
		
		
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *
//		
//		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=(rows-i);j++) {
//				System.out.print(" "+" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();	
//		}
		
		
		
		
		
		
//          1 
//        2 2 
//      3 3 3 
//    4 4 4 4 
//  5 5 5 5 5 
//		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=(rows-i);j++) {
//				System.out.print(" "+" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();	
//		}
		
		
		
		
//           1 
//         1 2 
//       1 2 3 
//     1 2 3 4 
//   1 2 3 4 5
//		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=(rows-i);j++) {
//				System.out.print(" "+" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();	
//		}
	
		
		
//                  A 
//                B C 
//              D E F 
//            G H I J 
//          K L M N O
//		
//		int rows=5;
//		int k=1;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=(rows-i);j++) {
//				System.out.print(" "+" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k++;
//			}
//			System.out.println();	
//		}
		
		
		
		
//		                    =============== ASSIGNMENT 1 AND 2 =========================
		
//		        1
//		      2 1
//		    3 2 1 
//        4 3 2 1		
//		5 4 3 2 1 
//	
//      int rows =5;
//      for(int i=1;i<=rows;i++){
//          for(int j=1;j<=rows-i;j++){
//              System.out.print(" "+" ");
//          }
//          for(int j=i;j>=1;j--){
//               System.out.print(j+" ");
//          }
//          System.out.println();
//      }
		
		
		
		
//                  5 
//                5 4 
//              5 4 3 
//            5 4 3 2 
//          5 4 3 2 1 
		
      int rows =5;
      for(int i=1;i<=rows;i++){
          for(int j=1;j<=rows-i;j++){
              System.out.print(" "+" ");
          }
          for(int j=rows;j>=(rows+1-i);j--){
               System.out.print(j+" ");
          }
          System.out.println();
      }
}
}
