package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Contact> contacts = new ArrayList<>();

		System.out.print("Enter the number of  contacts to add to the Address Book : ");
		int numContacts = input.nextInt();
		input.nextLine();
		for (int i = 1; i <= numContacts; i++) {
			System.out.println("Enter the details for contact " + i + ":");
			System.out.print("Enter your First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter your Lirst Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter your Address: ");
			String address = input.nextLine();
			System.out.print("Enter your City: ");
			String city = input.nextLine();
			System.out.print("Enter your State : ");
			String state = input.nextLine();
			System.out.print("Enter your Zip: ");
			String zip = input.nextLine();
			System.out.print("Enter your Phone Number : ");
			String phone = input.nextLine();
			System.out.print("Enter Your Email: ");
			String email = input.nextLine();
			contacts.add(new Contact(firstName, lastName, address, city, state, zip, phone, email));
		}

		System.out.println("Address Book:");
		for (Contact contact : contacts) {
			System.out.println(contact);
		}

		System.out.print("Enter the name of the contact to edit or delete: ");
		String firstNameToEditOrDelete = input.nextLine();
		Contact contactToEditOrDelete = null;
		for (Contact contact : contacts) {

			String editOrDelete = input.nextLine();
			System.out.println("1-Want to edit contact.\n 2-want to delete contact");
			int sc = input.nextInt();			
			if (contact.getFirstName().equals(firstNameToEditOrDelete)) {
				contactToEditOrDelete = contact;
				System.out.print("Enter the New First Name: ");
				String newfirstName = input.nextLine();
				System.out.print("Enter the New Last Name: ");
				String newlastName = input.nextLine();
				System.out.print("Enter the New Address: ");
				String newaddress = input.nextLine();
				System.out.print("Enter the New City: ");
				String newcity = input.nextLine();
				System.out.print("Enter the New State: ");
				String newstate = input.nextLine();
				System.out.print("Enter the New Zip: ");
				String newzip = input.nextLine();
				System.out.print("Enter the New Phone Number: ");
				String newphone = input.nextLine();
				System.out.print("Enter the new email: ");
				String newemail = input.nextLine();

				contactToEditOrDelete.setFirstName(newfirstName);
				contactToEditOrDelete.setLastName(newlastName);
				contactToEditOrDelete.setAddress(newaddress);
				contactToEditOrDelete.setCity(newcity);
				contactToEditOrDelete.setState(newstate);
				contactToEditOrDelete.setZip(newzip);
				contactToEditOrDelete.setPhone(newphone);
				contactToEditOrDelete.setEmail(newemail);

				System.out.println("Address Book (after editing):");
				System.out.print("Enter '2' to delete the contact: ");
				for (Contact contactnew : contacts) {
					System.out.println(contact);
				}
			} else if (contactToEditOrDelete.equals(2)) {

				contacts.remove(contactToEditOrDelete);

				System.out.println("Address Book (after deleting):");
				for (Contact contactnew : contacts) {
					System.out.println(contact);

				}

			}

		}

	}
}