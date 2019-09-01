package DecoratorBaking;

public abstract class BakedGoods {
	
	String description = "Generic Baked Goods";

	
	public String getDescription() {
       return description;
     }
	
	public abstract double cost();
	
}