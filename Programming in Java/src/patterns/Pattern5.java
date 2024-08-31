package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		
		
		

//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        *
		
		
		
//		  int rows =5 ;
//		  for(int i=1;i<=rows;i++){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=rows+1-i;j++){
//		           System.out.print("*"+" ");
//		      }    
//		      System.out.println();
//		  }
		
		
		
		
		
//		* * * * * * * * * 
//		  * * * * * * * 
//		    * * * * * 
//		      * * * 
//		        * 
		        
		        
		        
//		  int rows =5 ;
//		  for(int i=1;i<=rows;i++){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=rows+1-i;j++){
//		           System.out.print("*"+" ");
//		      }    
//		      for(int j=1;j<=rows-i;j++) {
//		    	  System.out.print("*"+" ");
//		      }
//		      System.out.println();
//		  
//		  }
		
		
		
		
		
		
//		1 2 3 4 5 4 3 2 1 
//		  1 2 3 4 3 2 1 
//		    1 2 3 2 1 
//		      1 2 1 
//		        1 
	
		
		
//		  int rows =5 ;
//		  for(int i=1;i<=rows;i++){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=rows+1-i;j++){
//		           System.out.print(j+" ");
//		      }    
//		      for(int j=rows-i;j>=1;j--) {
//		    	  System.out.print(j+" ");
//		      }
//		      System.out.println();
//		  
//		  }
		  
		
		
		
		
		
		
//	===============================================================================================================	
		  
//		  CHEAT CODE PRACTICE FOR ABOVE CODE
//		  IN THE FIRST FOR LOOP JUST REVERSE START AND END CONDITION WITH ALSO INCREMENT OR DECREMNT
		
		
//                       1 
//                     1 2 1 
//                   1 2 3 2 1 
//                 1 2 3 4 3 2 1 
//               1 2 3 4 5 4 3 2 1 
		
//		
//		  int rows =5 ;
//		  for(int i=rows;i>=1;i--){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=rows+1-i;j++){
//		           System.out.print(j+" ");
//		      }    
//		      for(int j=rows-i;j>=1;j--) {
//		    	  System.out.print(j+" ");
//		      }
//		      System.out.println();
//		  
//		  }
		
		
//      		1 2 3 4 5 4 3 2 1 
//		          1 2 3 4 3 2 1 
//		            1 2 3 2 1 
//		              1 2 1 
//		                1 
//		                1 
//		              1 2 1 
//		            1 2 3 2 1 
//		          1 2 3 4 3 2 1 
//		        1 2 3 4 5 4 3 2 1 
			
		
//		  int row =5 ;
//		  for(int i=1;i<=row;i++){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=row+1-i;j++){
//		           System.out.print(j+" ");
//		      }    
//		      for(int j=row-i;j>=1;j--) {
//		    	  System.out.print(j+" ");
//		      }
//		      System.out.println();
//		  
//		  }
//		
//		
//		  int rows =5 ;
//		  for(int i=rows;i>=1;i--){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=1;j<=rows+1-i;j++){
//		           System.out.print(j+" ");
//		      }    
//		      for(int j=rows-i;j>=1;j--) {
//		    	  System.out.print(j+" ");
//		      }
//		      System.out.println();
//		  
//		  }
		
		
//	============================================================================================================
		
		
		
//		5 4 3 2 1 2 3 4 5 
//		  5 4 3 2 3 4 5 
//		    5 4 3 4 5 
//		      5 4 5 
//		        5 

		
//		  int rows =5 ;
//		  for(int i=1;i<=rows;i++){
//		      for(int j=1;j<=i-1;j++){
//		          System.out.print(" "+" ");
//		      }
//		      for(int j=5;j>=i;j--){
//		           System.out.print(j+" ");
//		      }    
//		      for(int j=i+1;j<=5;j++) {
//		    	  System.out.print(j+" ");
//		      }
//		      System.out.println();
//		  
//		  }
		
		 
		  
		
//		1 
//		2 0 
//		1 2 0 
//		1 2 0 1 
//		2 0 1 2 0 
		
		
//			int rows=5;
//			int k=1;
//			for(int i=1;i<=rows;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print(k%3+" ");
//					k++;
//				}
//				System.out.println();
//			}
		
		
		
//		                       1
//		                       3  2
//		                       6  5  4
//		                       10 9  8  7 
//		                       15 14 13 12 11
		
//		int k=1;
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
		
		
		

//		        int n = 5; 
//		        int number = 1; 
//
//		        for (int i = 1; i <= n; i++) {  
//		            int current = number + i - 1; 
//		            
//		            for (int j = 1; j <= i; j++) { 
//		                System.out.print(current-- + " ");  
//		            }
//		            number += i;  
//		            System.out.println();  
//		        }
		        
		        
		        
//				int k=1;
//				int rows=5;
//				for(int i=1;i<=rows;i++) {
//					for(int j=1;j<=i;j++) {
//						System.out.print(k+" ");
//						k--;
//					}
//					k=k+(2*i)+1;
//					System.out.println();
//				}
		
		
		int rows=5;
		int sum=0;
		for(int i=1;i<=rows;i++) {
			sum=sum+i;
			int k=sum;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		        
		
}
}
