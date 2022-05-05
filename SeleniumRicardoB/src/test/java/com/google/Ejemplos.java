package com.google;

public class Ejemplos {

	public static void main(String args[]) {
		System.out.println(printNumberInWord(3));
		KPH(35);
		shoudlWakeUP(true, 9);
		
		
		
		Humano ricardo = new Humano(2, 2, 2, "Cafe Oscuro", "Cafe Oscuro", 1.73);
		Humano ricardo2 = new Humano("Cafe Oscuro", "Cafe Oscuro", 1.73);
		System.out.println(ricardo.colorOjos);
	}
	
	public static String printNumberInWord(int number) {
		if (number > 0) {
			switch (number) {
			case 0:
				return "ZERO";
			case 1:
				return "ONE";
			case 2:
				return "TWO";
			case 3:
				return "THREE";
			case 4:
				return "FOUR";
			case 5:
				return "FIVE";
			case 6:
				return "SIX";
			case 7:
				return "SEVEN";
			case 8:
				return "EIGHT";
			case 9:
				return "NINE";
			default:
				return "OTHER";
			}
		} else if (number < 0) {
			return "It's a negative number.";
		}
		return null;

	}

	public static void KPH(double KPH) {
		if (KPH < 0) {
			System.out.println("Invalid value");
		} else {
			double MPH = Math.round(KPH * 0.621371);

			System.out.println(KPH + " km/h = " + MPH + "mi/h");
		}

	}

	public static boolean shoudlWakeUP(boolean isBarking, int hourOfDay) {
		if (isBarking == true && hourOfDay > 8 && hourOfDay < 22) {
			System.out.println("You shall wake up!");
			return true;
		} else {
			if (isBarking == false) {
				System.out.println("The dog is asleep!");
				return false;
			} else if (hourOfDay < 8 || hourOfDay > 22) {
				System.out.println("It's not before 8AM or after 10PM");
				return false;
			} else {
				System.out.println("Hour needs to be in range");
				return false;
			}

		}
	}
}
