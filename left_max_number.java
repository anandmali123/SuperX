import java.util.*;
class LeftMax{
	static int lmax(int n){
		int max=Integer.MIN_VALUE;
		int p=n;
		while(p!=0){
			int r=p%10;
			if(r>max)
				max=r;
			p=p/10;
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(lmax(n));
	}
}


