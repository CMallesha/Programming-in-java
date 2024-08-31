package patterns;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		
		
		
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 

		
//		int rows=5;
//		
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			for(int j=1;j<=i-1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1;i<rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=rows-i;j++) {
//				System.out.print("* ");
//			}
//			for(int j=1;j<=rows-1-i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
//		USING CHEAT CODE
		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			for(int j=1;j<=i-1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		//copy paste same code but change fist for loop 
//		
//		for(int i=rows-1;i>=1;i--) {
//			for(int j=1;j<=rows-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			for(int j=1;j<=i-1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}	
		
		
		
		
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
//  1 2 3 4 3 2 1 
//    1 2 3 2 1 
//      1 2 1 
//        1 
		
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
//		
//		
//		for(int i=rows-1;i>=1;i--) {
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
		
		
		
//		
//        E 
//      E D E 
//    E D C D E 
//  E D C B C D E 
//E D C B A B C D E 
//  E D C B C D E 
//    E D C D E 
//      E D E 
//        E 
		
//	    int rows =5;
//	    for(int i=1;i<=rows;i++){
//	        for(int j=1;j<=rows-i;j++){
//	            System.out.print(" "+" ");
//	        }
//	        for(int j=rows;j>=(rows+1-i);j--){
//	             System.out.print((char)(j+64)+" ");
//	        }
//	        for(int j=rows-i+2;j<=5;j++){
//	            System.out.print((char)(j+64)+" ");
//	        }
//	        System.out.println();
//	    }
//	    
//	    for(int i=rows-1;i>=1;i--){
//	        for(int j=1;j<=rows-i;j++){
//	            System.out.print(" "+" ");
//	        }
//	        for(int j=rows;j>=(rows+1-i);j--){
//	             System.out.print((char)(j+64)+" ");
//	        }
//	        for(int j=rows-i+2;j<=5;j++){
//	            System.out.print((char)(j+64)+" ");
//	        }
//	        System.out.println();
//	    }
		
		
		
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O
		
		
		
//		int k=1;
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k++;
//			}
//			System.out.println();
//		}
		
		
		
//		A 
//		b C 
//		d E f 
//		G h I j 
//		K l M n O
		
//		int k=1;
//		int count=0;
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				
//				if(count%2==0) {
//					System.out.print((char)(k+64)+" ");
//				}
//				else {
//					System.out.print((char)(k+64+32)+" ");  // 32 BCZ A-65
//					                                        //        a-97
//					                                        //   DIFF=32
//				}
//				k++;
//				count++;
//			}
//			System.out.println();
//		}
		

//		
//        E 
//      E D E 
//    E D C D E 
//  E D C B C D E 
//E D C B A B C D E 
//  E D C B C D E 
//    E D C D E 
//      E D E 
//        E 

	// WITHOUT CHEAT CODE
		
		int rows =5;
	    for(int i=1;i<=rows;i++){
	        for(int j=1;j<=rows-i;j++){
	            System.out.print(" "+" ");
	        }
	        for(int j=rows;j>=(rows+1-i);j--){
	             System.out.print((char)(j+64)+" ");
	        }
	        for(int j=rows-i+2;j<=5;j++){
	            System.out.print((char)(j+64)+" ");
	        }
	        System.out.println();
	    }
		
	    for(int i=1;i<rows;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("  ");
	    	}
	          for(int j=rows;j>=i+1;j--) {
	    	System.out.print((char)(j+64)+" ");
	       }
	        for(int j=i+2;j<=rows;j++) {
	    	System.out.print((char)(j+64)+" ");
	    }
	        System.out.println();
	    }
		
		
}
}
