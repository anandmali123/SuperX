import java.util.*;
class Even_replace{
         public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);//nextInt();
		 int N = sc.nextInt();
		 int A[]=new int[N];
		 int B[]= new int[N];
		 for(int i=0;i<N;i++){
			A[i] =sc.nextInt();
		 }
		 for(int i=0;i<N;i++){
			 if(A[i]%2==0)
				 B[i]=1;
		 }
	   System.out.println("Ans is : ");
	   for(int m:B){
		   System.out.print(m+" ");
	   }
	 }
}

