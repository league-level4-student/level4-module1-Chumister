package _04_Intro_To_Enums;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class StatesOfMatter {
	enum DataTypes{
		SOLID, LIQUID, GAS, PLASMA, BOSE_EINSTEIN_CONDENSATE
	}
	public static void main(String[] args) {
		DataTypes data = DataTypes.BOSE_EINSTEIN_CONDENSATE;
		if (data == DataTypes.BOSE_EINSTEIN_CONDENSATE) {
			System.out.println("Einstein");
		}
		switch(data) {
		case BOSE_EINSTEIN_CONDENSATE:{
			
		}
		}
	}
}
