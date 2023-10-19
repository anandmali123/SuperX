class Palindrome{
	static String reverse(int N){
		int x=N;
		int rev=0;
		while(x!=0){
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		if(rev==N)
			return "Palindrome";
		return "Not Palindrome";
	}
	public static void main(String[] args){
		int n=124;
		System.out.println(reverse(n));
	}
}




