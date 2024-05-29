package MyRandomPractices.duplicatePractise;

public class Aabcbbdeaa {
	public static void main(String[] args) {
		String s = "aabcbbdeaa";//aa ab bc cb bb bd de ea aa 
		String s2="";
		for(int i=0;i<s.length()-1;i++) {
			
			s2=s2+s.charAt(i)+""+s.charAt(i+1)+" ";
		}
		System.out.println(s2);
	}

}
