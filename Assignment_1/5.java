//import org.apache.commons.lang3.StringUtils;
class Demo{

	//public static void main(String[] args){
      static String isalpha(String s){	

		for(int i=0;i<s.length();i++){
	//		if(Character.isAplhabetic(s.charAt(i)==false))
                       if(s.charAt(i)<=65  || (s.charAt(i)<=89||s.charAt(i)<=96)   ||(s.charAt(i)>=112))	
	
		
	//	System.out.println("True");
//		System.out.println(StringUtils.isAlpha(s));
	return "not contains alph";
		      // return "Contains aplha ";

      }
      return "yes contains alpha";
      }
      public static void main(String[] args){
	      String s="Helloworld123";
	      System.out.println(isalpha(s));
      }
	
}

		
