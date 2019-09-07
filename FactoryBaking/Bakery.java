
abstract public class Bakery {
	String name;

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Kneading dough for " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}


	public void pack() {
		System.out.println("Packing 'em.... " + name);
	}
}

