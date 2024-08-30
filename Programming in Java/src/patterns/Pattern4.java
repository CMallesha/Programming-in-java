package patterns;

public class Pattern4 {
	public static void main(String[] args) {
		
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
//
     
//	   int rows=5;
//       for(int i=1;i<=rows;i++) {
//           for(int j=1;j<=(rows-i);j++) {
//                System.out.print(" "+" ");
//              }
//               for(int j=1;j<=i;j++) {
//                    System.out.print("*"+" ");
//              }
//               for(int j=1;j<=(i-1);j++) {
//                    System.out.print("*"+" ");
//              }
//                System.out.println();
//              }
       
       
       
       
		
		
//                   1 
//                 1 2 1 
//               1 2 3 2 1 
//             1 2 3 4 3 2 1 
//           1 2 3 4 5 4 3 2 1 
		
			
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=(rows-i);j++) {
//				System.out.print(" "+" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			for(int j=i-1;j>=1;j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//                      5 
//                    5 4 5 
//                  5 4 3 4 5 
//                5 4 3 2 3 4 5 
//              5 4 3 2 1 2 3 4 5
		
		
//	    int rows =5;
//	    for(int i=1;i<=rows;i++){
//	        for(int j=1;j<=rows-i;j++){
//	            System.out.print(" "+" ");
//	        }
//	        for(int j=rows;j>=(rows+1-i);j--){
//	             System.out.print(j+" ");
//	        }
//	        for(int j=rows-i+2;j<=5;j++){
//	            System.out.print(j+" ");
//	        }
//	        System.out.println();
//	    }
//		
		
		
		
		
//   ========================================= ASSIGNMENT 3 AND 4 ================================================
		
		
//                     1 
//                   2 1 2 
//                 3 2 1 2 3 
//               4 3 2 1 2 3 4 
//             5 4 3 2 1 2 3 4 5 
		

//		  int rows =5;
//		  for(int i=1;i<=rows;i++){
//		      for(int j=1;j<=rows-i;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=i;j>=1;j--){
//		           System.out.print(j+" ");
//		      }
//		      for(int j=2;j<=i;j++){
//		          System.out.print(j+" ");
//		     }
//		     
//		      System.out.println();
//		  }
		
		
//                  5 
//                4 5 4 
//              3 4 5 4 3 
//            2 3 4 5 4 3 2 
//          1 2 3 4 5 4 3 2 1 
          
          
//	    int row=5;
//	    for(int i=1;i<=row;i++){
//	        for(int j=1;j<=row-i;j++){
//	            System.out.print(" "+" ");
//	        }
//	        for (int j=(row+1-i);j<=row;j++){
//	            System.out.print(j+" ");
//	        }
//	        for(int j=row-1;j>=(row+1-i);j--){
//	            System.out.print(j+" ");
//	        }
//	        System.out.println();
//	    }

		
//		==========================================================================================================
		

		
//                                   A 
//                                 B A B 
//                               C B A B C 
//                             D C B A B C D 
//                           E D C B A B C D E 
		
		
		int rows =5 ;
		  for(int i=1;i<=rows;i++){
		      for(int j=1;j<=rows-i;j++){
		          System.out.print(" "+" ");
		      }
		      for(int j=i;j>=1;j--){
		           System.out.print((char)(j+64)+" ");
		      }
		      for(int j=2;j<=i;j++){
		          System.out.print((char)(j+64)+" ");
		     }
		     
		      System.out.println();
		  }


}
}
