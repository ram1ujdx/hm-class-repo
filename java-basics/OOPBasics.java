class Person{
	private String personName;
	private String email;
	private int age;

	public Person(){
		System.out.println("Person Object Created");
	}

	public Person(String personName, String email, int age){
		this.personName=personName;
		this.age=age;
		this.email=email;
	}


	public void setPersonName(String personName){
		this.personName = personName;
	}

	public String getPersonName(){
		return personName;
	}

	public void setEmail(String email){
		// check if email is valid
		// ....
		this.email=email;
	}

	public void saySomething(){
		System.out.println("Hello from "+personName);
	}

	public void showPersonDetails(){
		System.out.println("Name : "+personName);
		System.out.println("Email : "+email);
		System.out.println("Age : "+age);
	}
}

class OOPBasics{
	public static void main(String []args){
		Person p1 = new Person();
		p1.setPersonName("Rohit");
		p1.setEmail("rohit@gmail.com");
		
		p1.showPersonDetails();

		Person p2= new Person("Karan", "karan@xyz.com", 28);

		p2.showPersonDetails();

		
	}
}


		