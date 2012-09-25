
public class Mammal {
	String name,type;
	int age;
	
	public Mammal(String name, int age, String type){
		this.name=name;		
		this.age=age;
		this.type=type;
	}
	public void eat(){
		System.out.println("Yummy!");
	}
	public void sleep(){
		System.out.println("ZzZzZzz");
	}

}
