
public class AwesomeBakery {

public static void main(String[] args) {
	CookieStore factory = new CookieStore();
	BakeryStore store = new BakeryStore(factory);

	Bakery bakery = store.order("ChocolateChip");
	System.out.println("It's time for " + bakery.getName() + "\n");
	
	
	bakery = store.order("Molasses");
    System.out.println("It's time for " + bakery.getName() + "\n");
   
}
}

