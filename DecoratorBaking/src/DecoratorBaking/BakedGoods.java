package DecoratorBaking;

public abstract class BakedGoods {
	
	String description = "Generic Baked Goods";
	String toppings = "no added toppings";
	
	public String getDescription() {
       return description + " " + toppings;
     }
	
}