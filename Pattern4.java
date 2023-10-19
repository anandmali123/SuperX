import java.util.*;
class Demo{
	public static void main(String[] args){
		int i=2;
		int j=0;
		for(int p=0;p<4;p++){
			for(int k=0;k<=p;k++){
				System.out.print(i*j+" ");
				i++;
				j++;
			}
			System.out.println();
		}
	}
}

