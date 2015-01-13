import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Ansr;
		float Ansr_num;
		float days11;
		float days12;
		float days13;
		float totals;
		String yes = "y";
		String no = "no";
		String Resident = "Your depenent qualifies for tax purposes";
		String Non_Resident = "Your dependent does not qualify for tax purposes";

		System.out.println("Please answer the following questions");
		System.out
				.println("Was your dependent in the U.S. for at least 183 in 2013? (Y/N)");
		Ansr = scan.nextLine();
		if (yes.equalsIgnoreCase(Ansr)) {
			System.out.println(Resident);
		} else {
			System.out
					.println("Was your dependent present for at least 31 days in 2013? (Y/N)");
			Ansr = scan.nextLine();
			if (yes.equalsIgnoreCase(Ansr)) {
				System.out
						.println("Was your dependent present for the entire years of 2012 and 2011? (Y/N)");
				Ansr = scan.nextLine();

				if (yes.equalsIgnoreCase(Ansr))
					System.out.println(Resident);
				else {
					System.out
							.println("Was your dependent in the U.S. at all in the years 2012 and 2011? (Y/N)");
					Ansr = scan.nextLine();
					if (yes.equalsIgnoreCase(Ansr)) {
						System.out.println("How long in 2013?");
						Ansr_num = scan.nextFloat();
						days13 = Ansr_num;
						System.out.println("How long in 2012?");
						Ansr_num = scan.nextFloat();
						days12 = Ansr_num / 3;
						System.out.println("How long in 2011?");
						Ansr_num = scan.nextFloat();
						days11 = Ansr_num / 6;
						totals = days11 + days12 + days13;
						if (totals>183){
							System.out.println("Did your dependent have a home in another country and have closer ties to it than heir U.S. home? (Y/N)");
							Ansr = scan.nextLine();
							Ansr = scan.nextLine();
							if(no.equalsIgnoreCase(Ansr))
								System.out.println(Resident);
							if(yes.equalsIgnoreCase(Ansr))
								System.out.println(Non_Resident);
						}
						if (totals < 183)
							System.out.println(Non_Resident);
					}
				}
			}
		}
	}
}