/**
 * 
 * @author Jolar Tabungar; 101030060; Lab Section L1
 * @version 2018.09.11
 *
 */
public class BuddyInfo {
	
	private static String name;
	private static String address;
	private static String number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Test change.");
		System.out.println("Test change 2.");
		System.out.println("Test Change 3.");
		
		new BuddyInfo("Homer", "100 Wayview Dr.", "613-229-9981");
		
		System.out.println("Hello " + getName() + ".");
		System.out.println("Your address is: " + getAddress());
		System.out.println("Your number is: " + getNumber());
	}
	
	public BuddyInfo(String name, String address, String number) {
		setName("Homer");
		setAddress("100 Wayview Dr.");
		setNumber("613-229-9981");
	}

	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		BuddyInfo.name = name;
	}

	/**
	 * @return the address
	 */
	public static String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public static void setAddress(String address) {
		BuddyInfo.address = address;
	}

	/**
	 * @return the number
	 */
	public static String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public static void setNumber(String number) {
		BuddyInfo.number = number;
	}

}
