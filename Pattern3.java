import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=0;int p=1;
		int n=sc.nextInt();
		int x=p;           //                             m                                                            
                int s=n-1;
		int prev;
		for(int i=1;i<=n*n;i++){
			count++;
			System.out.print(p+" ");
			if(count%n==0){
				System.out.println();
			//	p--;
				p=x+s;
				x=p;
				s--;
				continue;

			}
		
			p++;
		}
	}
}


