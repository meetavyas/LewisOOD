
public class CookieStore {

public Bakery bakeCookies(String type) {
	Bakery cookies = null;

	if (type.equals("ChocolateChip")) {
		cookies = new ChocolateChip();
	} else if (type.equals("Molasses")) {
		cookies = new Molasses();
	} 
	return cookies;
}
}
