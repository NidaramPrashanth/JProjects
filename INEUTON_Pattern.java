package firstAssignment;

public class INEUTON_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=19;
		for(int i=0;i<n;i++) {
			
			//1.  I
			
			for(int j=0;j<n;j++) {
				
				if((i==0 && j<=(n-1)/2)  || j==n/4    || ( i==n-1 && j<=(n-1)/2))
//				
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			
			
			// 2. N
			for(int j=0;j<n;j++) { 
			
			  
			if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			//3. E
			for(int j=0;j<n;j++) {
				if((i==0 && j>=n/4) || (i==(n-1)/2 && j>=n/4) ||( i==n-1 && j>=n/4) || (j==n/4 ))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			//4. U
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>=0 && i<(n-1)) ||
						(j==(3*n)/4 && i>=0 && i< n-1)||
						 (i==n-1 && j>n/4 && j<(3*n)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			
			//5.  R
			for(int j=0;j<n;j++) {
				if((j==n/4  )|| (i==0 && j>n/4 && j<(3*n)/4) || (j==(3*n)/4 && i>0 && i<(n-1)/2 ) ||
						(i==(n-1)/2 && j>n/4 && j<(3*n)/4) || (i-j==(n)/4 && i>(n-1)/2 && j<=(3*n)/2) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			//6. O
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>0 && i<(n-1)) ||
					(j==(3*n)/4 && i>0 && i< n-1)||
					(i==0 && j>n/4 && j< (3*n)/4) ||
					(i==n-1 && j>n/4 && j<(3*n)/4) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			
			
			//7.  N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		

	}

}
