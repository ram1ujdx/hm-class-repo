class StringExample{
	
	public static void main(String []args){
			
		String str = "hello";
		String str2= new String("hello");
		boolean result = str.equalsIgnoreCase(str2);
		System.out.println(result);

		int output = str.compareTo(str2);

		System.out.println(output);
		int size = str.length();
		System.out.println(size);

		
	}

}