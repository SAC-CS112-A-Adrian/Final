import java.util.Scanner;

public class Final {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean again = true;

		while (again) {

			FlyingObject flyOne = new Bird(10, 3, 0);
			FlyingObject flyTwo = new Airplane(450, 50, 0);
			FlyingObject flyThree = new JetPlane(1000, 120, 0);
			FlyingObject flyFour = new Missile(2500, 800, 0);
			FlyingObject flyFive = new Superman(3500, 500, 0);

			for (int i = 0; i <= 30; i++) {

				flyOne.fly(i);
				flyTwo.fly(i);
				flyThree.fly(i);
				flyFour.fly(i);
				flyFive.fly(i);
				if (i == 0 || i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30) {
					System.out.println("\nTime of flight: " + i + " minute(s)");
					System.out.print("BIRD:\t\t");
					System.out.println(flyOne);
					System.out.print("AIRPLANE:\t");
					System.out.println(flyTwo);
					System.out.print("JETPLANE:\t");
					System.out.println(flyThree);
					System.out.print("MISSILE:\t");
					System.out.println(flyFour);
					System.out.print("SUPERMAN:\t");
					System.out.println(flyFive);
				}
			}

			System.out.printf("\nEnter 1 to run again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;
		}

	}

}
