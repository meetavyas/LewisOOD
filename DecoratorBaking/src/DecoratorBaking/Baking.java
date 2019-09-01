package DecoratorBaking;
public class Baking {

	public static void main(String[] args) {
		
		BakedGoods cookies = new Cookies();
		System.out.println(cookies.getDescription() + " $" + cookies.cost());
		
		BakedGoods moreCookies = new Cookies();
		moreCookies = new Sprinkles(moreCookies);
		System.out.println(moreCookies.getDescription() + " $" + moreCookies.cost());
		
		BakedGoods pies = new Pies();
		pies = new WhippedCream(pies);
		System.out.println(pies.getDescription() + " $" + pies.cost());
	}

}
