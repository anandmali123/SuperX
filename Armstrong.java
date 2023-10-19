import java.util.*;
class Demo{
	static void Armstrong(int n){
		int p=n;
		int count=0;
		while(p!=0){
		       count++;
		       p=p/10;
		}
		int x=n;
		int sum=0;
		while(x!=0){
			int r=x%10;
			x=x/10;
                     sum+=Math.pow(r,count);
		     		}
		if(sum==n)
			System.out.println("It is a Armstrong  number");
		else 
			System.out.println("Not armstrong");
	
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Armstrong(n);
	}


}


