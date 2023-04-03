package com.bridgelabz.addressbook;

public class AddressBook {

	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String zip;
	private final String phone;
	private final String email;

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ADDRESSBOOK \nfirstName =" + firstName + ", \nlastName =" + lastName + ", \naddress =" + address
				+ ", \ncity =" + city + ", \nstate =" + state + ", \nzip =" + zip + ", \nphone =" + phone
				+ ", \nemail =" + email;
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook("Swaran", "Bhargav", "17-25/7", "hyderabad", "Telangana", "500047",
				"9550252013", "swaranbhargav54@gmail.com");

		System.out.println(addressBook.toString());
	}
}
