package test;

import java.time.LocalDate;
import java.util.List;

import controller.CharitableGiftHelper;
import controller.CharityRecipientHelper;
import model.CharitableGift;
import model.CharityRecipient;
import model.Gift;
import model.Recipient;

public class AddACharityGiftTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharityRecipientHelper crecipienthelp = new CharityRecipientHelper();
		CharitableGiftHelper cgifthelp = new CharitableGiftHelper();

		// Delete a gift
		//CharitableGift toDeleteGift = new CharitableGift(3);
		//cgifthelp.deleteGift(toDeleteGift);
		
		// Delete a recipient
		//CharityRecipient toDeleteRecipient = new CharityRecipient(4);
		//crecipienthelp.deleteRecipient(toDeleteRecipient);

		// Create a charitable recipient and gift
		// CharityRecipient charity1 = new CharityRecipient("Iowa KidStrong", "C/O Cindy E
		// ", "Des Moines", "IA", "50311", "22-5566776");

		// crecipienthelp.insertRecipient(charity1);

		// CharitableGift gift1 = new CharitableGift(LocalDate.of(2018, 01, 01),
		// "cash", 50.00, charity1, false, false);

		// cgifthelp.insertGift(gift1);

		// Search for recipient by id
		// Recipient charity = crecipienthelp.getRecipientById(4);
		// System.out.println(charity.RecipientDetails());

		// Edit Recipient
		// crecipienthelp.editRecipient(4);

		// View all charity recipients
		//List<CharityRecipient> list = crecipienthelp.getRecipients();
		//for (CharityRecipient a : list) {
		//	System.out.println(a.RecipientDetails());
		//}
		
		//Search for charitable gift by
		//Gift cgift = cgifthelp.getGiftById(4);
		//System.out.println(cgift.toString());
		
		//Edit charitable gift
		cgifthelp.editGift(4);
		
		//View all charitable gifts
		List<CharitableGift> giftlist = cgifthelp.getGifts();
		for (CharitableGift a : giftlist) {
			System.out.println(a.toString());
		}
	}

}
