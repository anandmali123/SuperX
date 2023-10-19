import java.util.*;
import java.io.*;
class Count_Vowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
	        char[] strArray=s.toCharArray();

		for(char m: strArray){
			if(map.containsKey(m)){
				map.put(m,map.get(m)+1);
			}
			else{
				map.put(m,1);
			}
		
		}
		 
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		
	}
}


