/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Chase Raines
 * @version v0.02
 */

public class Main {
	public static void main(String[] args) {
		String description = "Pokemon Black 2 & White 2";
		String citation = "https://en.wikipedia.org/wiki/Pok%C3%A9mon_Black_2_and_White_2";

		RevisedHistoricalEvent[] array = new RevisedHistoricalEvent[3];
		array[0] = new RevisedHistoricalEvent("Poketto Monsutā Burakku Tsū & Howaito Tsū", new Date(7, 23, 2012), "JP",
				citation);
		array[1] = new RevisedHistoricalEvent(description, new Date(10, 7, 2012), "NA", citation);
		array[2] = new RevisedHistoricalEvent(description, new Date(10, 11, 2012), "AU", citation);
		array[3] = new RevisedHistoricalEvent(description, new Date(10, 12, 2012), "EU", citation);

		for (int i = 0; i < array.length; i++)
			array[i].teach();

		// String tulsaDescription = "A black teenager, who was working as a shoe shiner
		// in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white
		// woman on a public elevator in broad daylight. A group of white vigilantes,
		// intent on lynching him, and armed black men intent on protecting him gathered
		// at the courthouse. A shot rang out, and the violence began. The riot resulted
		// in 35 square blocks of destruction, including more than 1,250 homes,
		// churches, schools, businesses, a hospital, and a library.";
		// Date tulsaDay = new Date(5, 31, 1921);
		// HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		// //
		// System.out.println("====================================================");
		// // System.out.println("HISTORICAL EVENT EXAMPLE:");
		// //
		// System.out.println("====================================================");
		// // System.out.println(tulsaRiot);
		// tulsaRiot.teach();

		int[] array = { 4, 5, 6, 3, 2, 8, 9 };

		// Bubble Sort
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		
		// String tulsaRevised = "It started with newspaper reports that a black man had
		// assaulted a white elevator operator. He was arrested, and black World War I
		// vets rushed to the courthouse to prevent a lynching. Whites were deputized
		// and handed weapons, the shooting started and then it got out of hand. It was
		// mob rule for two days, and the result was the complete devastation of the
		// entire black community. The white mobs looted the homes and businesses before
		// they set fire to the community. Planes circled mid-air and bombed what was
		// known as Black Wall Street. The National Guard was called out after the
		// governor declared martial law, and imprisoned all blacks that were not
		// already in jail. More than 35 blocks were destroyed, along with more than
		// 1,200 homes, and some 300 people died, mostly Blacks.",
		// tulsaCitation =
		// "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		// RevisedHistoricalEvent tulsaMassacre = new
		// RevisedHistoricalEvent(tulsaDescription, tulsaDay,
		// tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// tulsaMassacre.teach();
	}
}