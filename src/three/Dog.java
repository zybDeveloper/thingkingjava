package three;

public class Dog {

	String name;
	String says;
	
	public static void main(String[]args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		
		spot.says="Ruff!";
		spot.name="spot";
		scruffy.says="Wurf!";
		scruffy.name="scruffy";
		
		System.out.println("spot name:"+spot.name+";spot says:"+spot.says);
		System.out.println("scruffy name:"+scruffy.name+";scruffy says:"+scruffy.says);
		
		
		Dog nDog;
		nDog=spot;
		System.out.println(nDog==spot);
		System.out.println(nDog!=spot);
		
		System.out.println(scruffy==spot);
		System.out.println(scruffy!=spot);
		System.out.println(scruffy==nDog);
	}
}
