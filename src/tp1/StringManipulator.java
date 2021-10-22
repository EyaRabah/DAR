package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
    	    String s2 = "";
	        for(int i = s.length() - 1; i >= 0; i--)
	        {
	            s2 = s2 + s.charAt(i);
	        }
        System.out.println("reverse : "+s2);
    }

    public void isPalindrome(){
        	boolean test=true ;
	    	int i = 0;
	    	int j= s.length() - 1;
			 while (j > i) 
			 {
				 if (s.charAt(i) != s.charAt(j)) 
				 {
					test= false; 
				 }
				 i++;
				 j--;
			 }
			 System.out.println("isPalindrome : " + test);
    }

    public void toUpperCase(){
       		String s2 = "";
	        for(int i = 0; i < s.length(); i++) {
	        	char c = s.charAt(i);
	        	if ((int)c < 122 && (int)c > 97)  
	        		s2= s2+ (char) (c - 32);
	        	else 		
	        		s2= s2+s.charAt(i);
	        	}
	        System.out.println("uppercase : "+ s.toUpperCase());
    }

    public void toLowerCase(){
        	 String s2 = "";
	        for(int i = 0; i < s.length(); i++) {
	        	char c = s.charAt(i);
	        	if ((int)c < 91 && (int)c > 64) 
	        		s2= s2+ (char) (c + 32);
	        	else 
	        		s2= s2+s.charAt(i);     
	            }
	        System.out.println("lowercase : "+ s2);
    }

    public void getVowelNumber(){
    	    int v=0;
	        s = s.toLowerCase();
	        for(int i = 0; i < s.length(); i++) {
	           char c = s.charAt(i); 
	           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') { 
	                v++;
	           }
	        }
	        System.out.println("vowelNumber : " + v);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
