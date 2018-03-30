package test;
import java.util.Scanner;

import model.CharitableGift;
import model.CharityRecipient;
import model.PersonRecipient;
import model.PersonalGift;
import model.Recipient;



public class StartGiftGiving {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
	

		String addingGift = addGifts();

		if (addingGift.equalsIgnoreCase("y")) {
			String giftType = giftType();
			String giftDesc = giftDesc();
			String giftDate = giftDate();
			double giftValue = giftValue();

			System.out.println("What is the recipient's name?");
			String fullName = in.nextLine();
			System.out.println("What is the recipient's street address, including suite or apt num?");
			String street = in.nextLine();
			System.out.println("What is the recipient's city?");
			String city = in.nextLine();
			System.out.println("What is the recipient's state abbreviation?");
			String state = in.nextLine();
			System.out.println("What is the recipient's zipcode?");
			String zip = in.nextLine();

			if (giftType.equalsIgnoreCase("p")) {
				Recipient pRecipient = createPRecipient(fullName, street, city, state, zip);
				System.out.println(pRecipient.toString());
				System.out.println("What is the occassion?");
				String giftOccasion = in.nextLine();

				PersonalGift gift1 = new PersonalGift(giftDate, giftDesc, giftValue, pRecipient, giftOccasion);
				System.out.println(gift1.toString());

			} else if (giftType.equalsIgnoreCase("c")) {
				Recipient cRecipient = createCRecipient(fullName, street, city, state, zip);
				System.out.println(cRecipient.toString());
				System.out.println("Is the gift tax deductible (y/n)?");
				String taxDeductible = in.nextLine();
				boolean deductible;
				if (taxDeductible.equalsIgnoreCase("y")) {
					System.out.println(" tax deductible is true");
					deductible = true;
					System.out.println(deductible);
				} else {
					deductible = false;
				}
				System.out.println("Do you have a receipt (y/n)?");
				String isThereReceipt = in.nextLine();
				boolean receipt;
				if (isThereReceipt.equalsIgnoreCase("y")) {
					receipt = true;
				} else {
					receipt = false;
				}

				CharitableGift gift2 = new CharitableGift(giftDate, giftDesc, giftValue, cRecipient, deductible,
						receipt);
				System.out.println(gift2.toString());
			}

		} else {
			System.out.println("Thank you!");
		}
	}

	public static String addGifts() {
		System.out.println("Are you giving a gift (y/n)? ");
		String addGift = in.nextLine();
		return addGift;

	}

	public static String giftType() {
		System.out.println("Will it be a [C]haritable gift or [P]ersonal gift? ");
		String typeGift = in.nextLine();
		return typeGift;
	}

	public static String giftDesc() {
		System.out.println("Please describe the gift?");
		String itemDesc = in.nextLine();
		return itemDesc;
	}

	public static double giftValue() {
		System.out.println("What is the value of the gift?");
		double itemValue = in.nextDouble();
		in.nextLine();
		return itemValue;
	}

	public static String giftDate() {
		System.out.println("What date did you give the gift (MM/DD/YY)?");
		String givenDate = in.nextLine();
		return givenDate;
	}

	public static PersonRecipient createPRecipient(String name, String street, String city, String state, String zip) {
		System.out.println("What is recipient's birthdate (MM/DD/YY)?");
		String bDate = in.nextLine();
		System.out.println("What is the recipient's relationship to you?");
		String relationship = in.nextLine();

		PersonRecipient pRecipient = new PersonRecipient(name, street, city, state, zip, bDate, relationship);
		return pRecipient;
	}

	public static CharityRecipient createCRecipient(String name, String street, String city, String state, String zip) {
		System.out.println("What is recipient's tax id number?");
		String taxNum = in.nextLine();

		CharityRecipient cRecipient = new CharityRecipient(name, street, city, state, zip, taxNum);
		return cRecipient;
	}

}
