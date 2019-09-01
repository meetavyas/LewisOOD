package DecoratorBaking;
public class Baking {

	public static void main(String[] args) {
		BakedGoods cookies = new Cookies();
		BakedGoods toppings = new Toppings();
		System.out.println("Customer ordered: " + cookies.getDescription() + toppings.getDescription());
		
		BakedGoods generic = new GenericGoods();
		System.out.println("Customer ordered: " + generic.getDescription());
	}

}
