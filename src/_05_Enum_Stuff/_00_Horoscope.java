package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
		enum Horo{
			Aries, Leo, Cancer, Pisces, Scorpio, Taurus, Sagittaurus, Gemini, Virgo, Libra, Capricorn, Aquarius
		}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
		
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		int h = JOptionPane.showOptionDialog(null, "Pick a zodiac", "Zodiac signs", 0,JOptionPane.INFORMATION_MESSAGE, null, Horo.values(), null);
		
		switch(h) {
		case 0:{
			System.out.println("Aries");
			break;
		}
		case 1:{
			System.out.println("Leo");
			break;
		}
		case 2:{
			System.out.println("Cancer");
			break;
		}
		case 3:{
			System.out.println("Pisces");
			break;
		}
		case 4:{
			System.out.println("Scorpio");
			break;
		}
		case 5:{
			System.out.println("Taurus");
			break;
		}
		case 6:{
			System.out.println("Sagittaurus");
			break;
		}
		case 7:{
			System.out.println("Gemini");
			break;
		}
		case 8:{
			System.out.println("Virgo");
			break;
		}
		case 9:{
			System.out.println("Libra");
			break;
		}
		case 10:{
			System.out.println("Capricorn");
			break;
		}
		case 11:{
			System.out.println("Aquarius");
			break;
		}
		}
	}
}
