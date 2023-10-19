import java.util.*;
class Demo{
	public static void main(String[] args){
		int x=1;
		Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int p=x;
			for(int j=0;j<n;j++){
				if(j>=n-i-1){
					System.out.print(p+" ");
					p=p+i+1;
				}
				else
					System.out.print("  ");
			}
			x++;
			System.out.println();
		}
	}
}

