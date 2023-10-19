import java.util.*;
class Demo{
	static boolean prime(int n){
		int count=0;
		for(int i=1;i<=n/2;i++){
			if(n%i ==0)
				count++;
		}
		if(count==1)
			return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();

		for(int i=s;i<=e;i++){
			if(prime(i)==true)
				System.out.print(i+" ");
		}
	}
}

