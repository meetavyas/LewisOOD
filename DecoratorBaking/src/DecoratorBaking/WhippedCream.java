package DecoratorBaking;

public class WhippedCream extends BakedGoodsDecorator {

	 BakedGoods bakedGoods;
	    
	    public WhippedCream(BakedGoods bakedGoods) {
	    	this.bakedGoods = bakedGoods;
	    }
	    
		public String getDescription() {
			return bakedGoods.description + " and whipped cream";
		}
		
		public double cost() {
			return bakedGoods.cost() + 0.50;
		}
}
