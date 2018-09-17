import java.util.ArrayList;

public class AddressBook {
	
	private static ArrayList<BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new ArrayList<BuddyInfo>();

	}

	public void addBuddy(BuddyInfo obuddyInfo) {
		if (obuddyInfo != null)
			addressBook.add(obuddyInfo);
	}
	
	public void removeBuddy(int index) {
		if (index >= 0 && index <= addressBook.size())
			addressBook.remove(index);
	}
	
	public static void main(String[] args) {
		
		System.out.println("AddressBook");
		
		
	}

	
}
