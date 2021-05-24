package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner dist = new Scanner(System.in);
		Scanner mass = new Scanner(System.in);
		Scanner energy = new Scanner(System.in);
		Scanner temp = new Scanner(System.in);
		while(true) {
			sysout("Please select an option:\n1. Time\n2. Distances\n3. Temperatures\n4. Mass\n9. Close the program\\n");
	
			int menuSelect = s.nextInt();
			
			switch(menuSelect) {
			case 1: //time converter menu
				while(true) {
					sysout("Please select from the energy converter menu or enter 4 to return to the main menu\n4. Return to main menu\n");
					int energyselect = energy.nextInt();
					double joules;
					switch(energyselect) {
					
					case 1: 
						sysout("Please enter how many BTU (British Thermal Units) you want to convert to joules: ");
						double BTU = energy.nextDouble();
						joules = mileToMeter(BTU);
						sysout(BTU + " British Thermal Units to Joules is " + joules + " joules of energy.");
						break;
					
					case 2:
						sysout("Please enter how many foot-pounds you want to convert to joules: ");
						double footlb = energy.nextDouble();
						joules = mileToMeter(footlb);
						sysout(footlb + " Foot-Pounds to Joules is " + joules + " joules of energy.");
						break;
					case 3:
						sysout("Please enter how many calories you want to convert to joules: ");
						double calories = energy.nextDouble();
						joules = mileToMeter(calories);
						sysout(calories + " calories to Joules is " + joules + " joules of energy.");
						break;
					case 4:
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(energyselect == 4) {
						break;
						}
					}
				break;
			
				
				
			case 2://dist converter menu
				while(true) {
					sysout("Please select from the distance converter menu or enter 4 to return to the main menu\n1. Miles to Meters\n2. Feet to Meters\n3. Inches to Meters\n4. Return to main menu\n");
					int distselect = dist.nextInt();
					double meters;
					switch(distselect) {
					case 1: 
						sysout("Please enter how many miles you want to convert to meters: ");
						double miles = dist.nextDouble();
						meters = mileToMeter(miles);
						sysout(miles + " miles to meters is " + meters + " meters.");
						break;
					
					case 2:
						sysout("Please enter how many feet you want to convert to meters: ");
						double feet = dist.nextDouble();
						meters = feetToMeter(feet);
						sysout(feet + " feet to meters is " + meters + " meters.");
						break;
					case 3:
						sysout("Please enter how many inches you want to convert to meters: ");
						double inch = dist.nextDouble();
						meters = inchToMeter(inch);
						sysout(inch + " inches to meters is " + meters + " meters.");
						break;
					case 4:
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(distselect == 4) {
						break;
						}
					}
				
				
			case 3: //temp converter menu
				while(true) {
					sysout("Please select from the temperature converter menu or enter 4 to return to the main menu\n1. Celsuis to Fahrenheit\n2. Celsuis to Kelvin\n3. Celsuis to Rankine\n4. Return to main menu\n");
					int tempselect = temp.nextInt();
					double temps;
					double celsuius;
					switch(tempselect) {
					case 1: 
						sysout("Please enter how many degrees in Celsuis you want to convert to Fahrenheit: ");
						celsuius = temp.nextDouble();
						temps = inchToMeter(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Fahrenheit.");
						break;
					
					case 2:
						sysout("Please enter how many degrees in Celsuis you want to convert to Kelvin: ");
						celsuius = temp.nextDouble();
						temps = inchToMeter(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Kelvin.");
						break;
					case 3:
						sysout("Please enter how many degrees in Celsuis you want to convert to Rankine: ");
						celsuius = temp.nextDouble();
						temps = inchToMeter(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Rankine.");
						break;
					case 4:
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(tempselect == 4) {
						break;
						}
					}
				break;
				
				
				
			case 4://mass converter menu
				while(true) {
					sysout("Please select from the mass converter menu or enter 4 to return to the main menu\n1. Stone to Grams\n2. Pound to Grams\n3. Ounce to Grams\n4. Return to main menu\n");
					int massSelect = mass.nextInt();
					double masses;
					switch(massSelect) {
					case 1: 

						break;
					
					case 2:

						break;
					case 3:

						break;
					case 4:
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(massSelect == 4) {
						break;
						}
					}
				break;
				
				
				
				
			case 9:
				dist.close();
				s.close();
				energy.close();
				mass.close();
				temp.close();
				System.exit(0);
			default:
				sysout("Please make a selection from the menu");

			}
		}
	}

	
	
	public static void sysout(String str) {
		System.out.println(str);
	}
	
	//Energy converters

	//distance converters
	public static double mileToMeter(double i) {
		double meters = i*1609.344;
		return meters;
	}
	public static double feetToMeter(double i) {
		double meters = i*.3048;
		return meters;
	}
	public static double inchToMeter(double i) {
		double meters = i*.0254;
		return meters;
	}
	
	//Temp converters
	
	//Mass converters
}
