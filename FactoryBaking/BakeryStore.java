
public class BakeryStore {
CookieStore factory;

public BakeryStore(CookieStore factory) {
	this.factory = factory;
}
	
public Bakery order(String type) {
         Bakery bakery;
         bakery = factory.bakeCookies(type);
         
         bakery.prepare();
         bakery.bake();
         bakery.pack();
         
         return bakery;
         
}

}
