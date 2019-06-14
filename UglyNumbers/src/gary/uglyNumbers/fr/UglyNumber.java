package gary.uglyNumbers.fr;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration de variable
		int number;
		boolean ugly = false;
		Scanner sc = new Scanner(System.in);
		
		// corps du programme
		System.out.println("Veuillez entré un nombre ...");
		number = sc.nextInt();
		
		if(number > 0) {
			if(number != 1) {
				if(number % 2 == 0) {
					ugly = true;
				}
				else {
					if(number % 3 == 0) {
						ugly = true;
					}
					else {
						if(number % 5 == 0) {
							ugly = true;
						}
					}
				}
			}
			else {
				ugly = true;
			}
		}
		
		if(ugly) {
			System.out.println(number + " est un ugly numbers.");
		}
		else {
			System.out.println(number + " n'est pas un ugly numbers.");
		}
	}

}
