package javaTut;

//import java.util.HashSet;
//import java.util.Set;

public class _34HashCode_Equals {

	public static void main(String[] args) {
		// OBJECT CLASS

		/**
		 * Object class is the parent class of the all the classes ever created
		 *
		 * METHODS getClass() clone() hashCode() wait() toString() equals() finalize()
		 * notify() notifyall()
		 **/

		/**
		 * The CONTRACT between equals() and hashCode()is: 1) If two objects are equal,
		 * then they must have the same hash code 2) If two objects have the same hash
		 * code, they may or may not be equal.
		 *
		 * BEST PRACTICES
		 *
		 * Always use same attributes of an object to generate hashCOde() and equals()
		 * both. equals() must be consistent(if the objects are not modified, then it
		 * must keep returning the same value) Whenever a.equals(b), then a.hashCode()
		 * must be same as b.hashCode() If you override one, then you should override
		 * the other.
		 **/

//		Pen pen1 = new Pen(10, "Blue");
//		Pen pen2 = new Pen(10, "Blue");

		// System.out.println(pen1);
		// System.out.println(pen2);

		// System.out.println(pen1 == pen2);
		// System.out.println(pen1.equals(pen2));

//		Set<Pen> pens = new HashSet<>();
//		pens.add(pen2);
//		pens.add(pen1);
//		System.out.println(pens);

	}

	
}

//class Pen {
//	int price;
//	String color;
//
//	public Pen(int price, String color) {
//		this.color = color;
//		this.price = price;
//	}
	// @Override // if we override equals than we have to override hashCode
	// public boolean equals(Object obj) {
	// Pen that = (Pen) obj;
	// return this.price == that.price && this.color.equals(that.color);
	// }
	//
	// @Override
	// public int hashCode() {
	// return price + color.hashCode();
	// }

	// GENERATED BY ECLIPSE
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result + price;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if ((obj == null) || (getClass() != obj.getClass()))
//			return false;
//		Pen other = (Pen) obj;
//		if (color == null) {
//			if (other.color != null)
//				return false;
//		} else if (!color.equals(other.color))
//			return false;
//		if (price != other.price)
//			return false;
//		return true;
//	}

//}