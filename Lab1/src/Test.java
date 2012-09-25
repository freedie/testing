
public class Test {

	public static void main(String[] args) {
		
		Mammal a1=new Dogs("Bobi",5,"Rottweiler");
		Mammal a2 = new Cats("Kedii",3,"Sarman","long");
		
		System.out.println("The type of the dog is "+a1.type+".");
		System.out.println("The type of the cat is "+a2.type+".");
	}

}
