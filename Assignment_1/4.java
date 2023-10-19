class Print{
	static int Reverse(int N){
		int x=N;
		int rev=0;
		while(x!=0){
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
	return rev;
	}
	public static void main(String[] args){
		int start = 25435;
		int end= 25449 ;
		while(start<=end){
			System.out.print(Reverse(start)+" ");
			start++;
		}
	}
}

