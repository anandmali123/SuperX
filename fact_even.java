import java.util.*;
class Demo{
	public static int fact(int n){
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	static void  fact_even(int n){
	        int[] arr=new int[100];
		int p=n;
		int count=0;
		while(p!=0){
			int r=p%10;
			p=p/10;
			if(r%2==0){
				arr[count++]=r;
			//	count++;
				
		}}
		for(int i=count-1;i>=0;i--){
                             System.out.print(fact(arr[i])+", ");
		}
	}
        public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	       	int n=sc.nextInt();
                fact_even(n);
	}
}

