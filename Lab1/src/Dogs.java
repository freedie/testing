
public class Dogs extends Mammal{
	
	public Dogs(String name, int age, String type){
		super(name,age,type);
		
	}
	public void talk (){
		System.out.println("Woof woof!");
	}
	
	public void happy(){
		System.out.println("He's moving his tail.");
	}
}
