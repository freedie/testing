
public class Cats extends Mammal {
	String whisker;
	public Cats(String name, int age, String type, String whisker){
		super(name,age,type);	
		this.whisker=whisker;
	}
	public void talk(){
		System.out.println("Meow!");
	}
	public void eat(){
		System.out.println("I like fish.");
	}
}
