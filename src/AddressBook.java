import java.util.ArrayList;

public class AddressBook {
	
	private static ArrayList<BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new ArrayList<BuddyInfo>();

	}

	public static void addBuddy(BuddyInfo obuddyInfo) {
		if (obuddyInfo != null)
			addressBook.add(obuddyInfo);
	}
	
	public static void removeBuddy(int index) {
		if (index >= 0 && index <= addressBook.size())
			addressBook.remove(index);
	}
	
	public static void main(String[] args) {
		
		BuddyInfo buddy = new BuddyInfo("Jak", "100 First St.", "911");
		
		addressBook.add(buddy);
		addressBook.add(buddy);
		//addressBook.remove(0);
		
		System.out.println(addressBook.get(1).getName());
		
	}

	
}
