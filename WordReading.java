package Day15;

public class WordReading {

	public static void main(String[] args) {
		HashMap hmap = new HashMap();
		String st = "Paranoid are not paranoid because they";
		String s = st.toLowerCase();
		String words[] = s.split(" "); 
	
		 for (String word : words) {
	            Integer t = hmap.get(word);
	            System.out.println(t);
	            if (t == 0) {
	                hmap.put(word, 1);
	                
	              System.out.println(hmap.get(word)+"new");
	            }else {
	                hmap.put(word, t + 1);
	              System.out.println(hmap.get(word)+"next");
	            }
	        }
		 hmap.show();
		 System.out.println(hmap.get("are"));// here again value is 0
		 hmap.put("are", 3);				// now if i put like this
		 System.out.println(hmap.get("are"));// it gives output: 3
		 // again running loop.
		 for (String word : words) {
			 Integer t = hmap.get(word);
			 System.out.println(t);
			 if (t == 0) {
				 hmap.put(word, 1);
				 
				 System.out.println(hmap.get(word)+"new");
			 }else {
				 hmap.put(word, t + 1);
				 System.out.println(hmap.get(word)+"next");
			 }
		 }
		 hmap.show();
		 System.out.println(hmap.get("are"));// it should be 4 but its 3

//		Integer i = 2;
//		HashMap hm = new HashMap();
//		hm.put("as", 1);
//		hm.put("as", 4);
//		System.out.println(hm.get("as")); 
//		hm.put("s", 1);
//		System.out.println(hm.get("s")); 
//		hm.put("a", 1+i);
//		
//		System.out.println(hm.get("we"));
//		System.out.println(hm.get("we"));
//		
//		hm.show();

	}

}
