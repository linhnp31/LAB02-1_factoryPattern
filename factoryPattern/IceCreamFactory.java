package factoryPattern;

public class IceCreamFactory {
	public static iceCream makeIceCream(String type) {
		switch (type) {
		case "1":
			return new VanillaIceCream();
		case "2":
			return new ChocolateIceCream();
		}
		return null;
	}
}
