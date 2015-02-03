import java.util.ArrayList;
import java.util.List;


public class Lamda {

	public static void main(String[] args) {
		TraditionalSearch.main(args);
	}

}


class Animal2 {
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal2(String speciesName, boolean hoper, boolean swimmer) {
		species = speciesName;
		canHop = hoper;
		canSwim = swimmer;
	}

	public String getSpecies() {
		return species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}
	
	@Override
	public String toString() {
		return species;
	}
	
}

interface CheckTrait {
	
	boolean test(Animal2 a);
	
}

class CheckIfHopper implements CheckTrait {

	@Override
	public boolean test(Animal2 a) {
		return a.isCanHop();
	}
	
}
 
class TraditionalSearch {
	
	public static void main(String[] args) {
		List<Animal2> animals = new ArrayList<>();
		animals.add(new Animal2("fish", false, true));
		animals.add(new Animal2("kangaroo", true, false));
		animals.add(new Animal2("rabbit", true, false));
		animals.add(new Animal2("tutrle", false, true));
		
		// Forma tradicional de verificar si un animal salta
		//print(animals, new CheckIfHopper());
		print(animals, animal -> animal.isCanHop());
		print(animals, animal -> animal.isCanSwim());
		print(animals, a -> !a.isCanSwim());
		print(animals, (Animal2 animal) -> {return !animal.isCanSwim();});
				
		ArrayList<String> list = new ArrayList<>();
		list.add("Juan");
		list.add("Pepe");
		list.add("Dano");
		System.out.println(list);
		list.removeIf(a -> a.charAt(0) != 'P');
		System.out.println(list);
		
		
	}
	
	private static void print(List<Animal2> animals, CheckTrait checker) {
		
		for (Animal2 animal2 : animals) {
			if(checker.test(animal2))
				System.out.println(animal2);
		}
		System.out.println();
		
	}
	
}