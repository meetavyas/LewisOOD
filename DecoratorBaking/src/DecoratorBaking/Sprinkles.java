package DecoratorBaking;

public class Sprinkles extends BakedGoodsDecorator {
	
    BakedGoods bakedGoods;
    
    public Sprinkles(BakedGoods bakedGoods) {
    	this.bakedGoods = bakedGoods;
    }
    
	public String getDescription() {
		return bakedGoods.description + " with sprinkles";
	}
	
	public double cost() {
		return bakedGoods.cost() + 0.30;
	}

}
