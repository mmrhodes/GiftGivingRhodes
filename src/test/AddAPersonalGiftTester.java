package test;

import java.time.LocalDate;
import java.util.List;

import controller.PersonRecipientHelper;
import controller.PersonalGiftHelper;
import model.Gift;
import model.PersonRecipient;
import model.PersonalGift;
import model.Recipient;

public class AddAPersonalGiftTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonRecipientHelper precipienthelp = new PersonRecipientHelper();
		PersonalGiftHelper pgifthelp = new PersonalGiftHelper();

		// Delete a recipient
		// PersonRecipient toDeleteRecipient = new PersonRecipient(1);
		// precipienthelp.deleteRecipient(toDeleteRecipient);

		// Delete a gift
		// PersonalGift toDeleteGift = new PersonalGift(1);
		// pgifthelp.deleteGift(toDeleteGift);

		// Create a person recipient and gift
		 PersonRecipient person1 = new PersonRecipient("Mark", "49 N Hawthorne",
		 "Altoona", "IA", "50009",
		 LocalDate.of(1972, 03, 13), "Spouse");

		 precipienthelp.insertRecipient(person1);

		 PersonalGift gift1 = new PersonalGift(LocalDate.of(2017, 12, 25), "basketball",
		 17.00, person1, "Christmas");

		 pgifthelp.insertGift(gift1);

		// Search for recipient by id
		//Recipient personr = precipienthelp.getRecipientById(2);
		//System.out.println(personr.RecipientDetails());

		// Edit recipient
		// precipienthelp.editRecRpient(2);

		// View all person recipients
		// List<PersonRecipient> list = precipienthelp.getRecipients();
		// for (PersonRecipient a : list) {
		// System.out.println(a.RecipientDetails());
		// }

		// Search for personal gift by id
		Gift pgift = pgifthelp.getGiftById(2);
		System.out.println(pgift.toString());

		// Edit personal gift
		pgifthelp.editGift(2);

		// View all personal gifts
		List<PersonalGift> giftlist = pgifthelp.getGifts();
		for (PersonalGift a : giftlist) {
			System.out.println(a.toString());
		}

	}

}
