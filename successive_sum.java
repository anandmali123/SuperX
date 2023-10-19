import java.util.*;
class Demo{
	static void succ_sum(int n){
		int count=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int p=n;
	//	int sum=0;
		while(p!=0){
			int r=p%10;
			p=p/10;
			int q=p%10;
			arr.add(r+q);
		}
		Object ans[] = arr.toArray();
		System.out.println(Arrays.toString(ans));

	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		succ_sum(n);
}

	
}
//T.C. - O(N)
//S.C.- O(1)
