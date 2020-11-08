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
		
		Horo data = Horo.Aquarius;
		if (data == Horo.Aquarius) {
			
		}
		switch(data) {
		case Aries:{
			
		}
		}
	}
}
