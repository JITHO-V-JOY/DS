class Main{
	public static void main(String args[]){
		String str = "Hello world";// string literal
		char name[] = {'h','e', 'l', 'l', 'o'};
		String str2 = new String(name);

		String str3 = new String("Zoho");

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		// substring
		System.out.println("an substring of "+str+" "+str.substring(1, 4));
 		System.out.println("an substring of "+str3+" "+str3.substring(0, 2));
		
		// lexicographical ordering
		
		if(str3.compareTo(str2) < 1){
			System.out.println(str3+" is greater than "+str);
		}else{
			 System.out.println(str3+" is less than "+str);
		}
	}

}
