import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int s=p;
		for(int i=0;i<p;i++){
			int x=s;
			for(int j=0;j<=i;j++){
				System.out.print(x+" ");
				x=x+i+1;
			}
			s++;
			System.out.println();
		}
	}
}

