package MyRandomPractices;

public class TwoStringsUniqueToNewString_pending{
	public static void main(String[] args) {
		String s1 = "arpan"; // arpn
	    String	a1[]=s1.split("");
		String s2 = "simran";// simran
		String	a2[]=s2.split("");
		String s3 = s1.concat(s2);// arpansimran
		String temp="";
		for(int i=0;i<s3.length();i++) {
			if(i<s1.length()) {
				if(!(s2.contains(a1[i]))) {
				temp=temp+a1[i];	
				}
			}else if(i>=s1.length()) {
				for(int j=0;j<s2.length();j++) {
					if(!(s1.contains(a2[j]))) {
						temp=temp+a2[j];
						
					}
					i++;
				}
			}
		}
		System.out.println(temp);
			

		/*LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        //a2r2p1n2s1i1m1
		for (int i = 0; i < s3.length(); i++) {
			if (hm.containsKey(s3.charAt(i))) {
				hm.put(s3.charAt(i), hm.get(s3.charAt(i)) + 1);
			} else {
				hm.put(s3.charAt(i), 1);
			}
		}

		for (Entry<Character, Integer> h : hm.entrySet()) {
			if (h.getValue() == 1) {
				System.out.println(h.getKey());
			}
		}*/
		
	}
}
