/* Program made by Houston Koester
 * All functions are separated into the ConversionFunctions class in a separate file for modularity
 * 
 * Currently developed for one way conversions, need to implement more functions
 * ^EX^ - gram -> stone && gram -> pound exist but pound -> gram does not.
 */
package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//Laying out the different scanners and the accessor to Functions class
		ConversionFunctions CF = new ConversionFunctions();
		Scanner s = new Scanner(System.in);
		Scanner dist = new Scanner(System.in);
		Scanner mass = new Scanner(System.in);
		Scanner energy = new Scanner(System.in);
		Scanner temp = new Scanner(System.in);
		
		//main menu repeatable selector, end main with input of 9 spaces 5-8 left for other conversion types
		while(true) {
			sysout("Please select an option:\n1. Time\n2. Distances\n3. Temperatures\n4. Mass\n9. Close the program");
			int menuSelect = s.nextInt();
			switch(menuSelect) {
			
			//Energy conversion menu switch
			case 1: 
				while(true) {
					sysout("Please select from the energy converter menu or enter 4 to return to the main menu\n1. Joules to BTU (British Thermal Units)\n2. Joules to Foot-Pounds\n3. Joules to Calories\n4. Return to main menu");
					int energyselect = energy.nextInt();
					double joules;
					double convert;
					switch(energyselect) {
					
					case 1: //joules to BTU
						sysout("Please enter how many joules you want to convert to BTU (British Thermal Units): ");
						joules = energy.nextDouble();
						convert = CF.joulToBTU(joules);
						sysout(joules + " Joules to British Thermal Units is " + convert + " BTU.");
						break;
					
					case 2://joules to FootPound
						sysout("Please enter how many joules you want to convert to foot-pounds: ");
						joules = energy.nextDouble();
						convert = CF.joulToFP(joules);
						sysout(joules + " Joules to Foot-Pounds is " + convert + " Foot-Pounds.");
						break;
						
					case 3: //joules to calories
						sysout("Please enter how many joules you want to convert to calories: ");
						joules = energy.nextDouble();
						convert = CF.joulToCal(joules);
						sysout(joules + " Joules to Calories is " + convert + " calories.");
						break;
						
					case 4: //main return break from menu loop
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
					}
					if(energyselect == 4) { //break to main
						break;
						}
					}
				break;
			
				
				
			case 2://dist converter menu
				while(true) {
					sysout("Please select from the distance converter menu or enter 4 to return to the main menu\n1. Meters to Miles\n2. Meters to Feet\n3. Meters to Inches\n4. Return to main menu");
					int distselect = dist.nextInt();
					double meters;
					double conversion;
					switch(distselect) {
					
					case 1: //meters to miles
						sysout("Please enter how many meters you want to convert to miles: ");
						meters = dist.nextDouble();
						conversion = CF.meterToMile(meters);
						sysout(meters + " meters to miles is " + conversion + " miles.");
						break;
					
					case 2: //meters to feet
						sysout("Please enter how many meters you want to convert to feet: ");
						meters = dist.nextDouble();
						conversion = CF.meterToFeet(meters);
						sysout(meters + " meters to feet is " + conversion + " feet.");
						break;
						
					case 3: //meters to inches
						sysout("Please enter how many meters you want to convert to inches: ");
						meters = dist.nextDouble();
						conversion = CF.meterToInch(meters);
						sysout(meters + " meters to inches is " + conversion + " inches.");
						break;
						
					case 4: //main return break from menu loop
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(distselect == 4) {//break to main
						break;
						}
					}
				break;
				
			case 3: //temp converter menu
				while(true) {
					sysout("Please select from the temperature converter menu or enter 4 to return to the main menu\n1. Celsuis to Fahrenheit\n2. Celsuis to Kelvin\n3. Celsuis to Rankine\n4. Return to main menu");
					int tempselect = temp.nextInt();
					double temps;
					double celsuius;
					switch(tempselect) {
					
					case 1: // celsuis to fehrenheit
						sysout("Please enter how many degrees in Celsuis you want to convert to Fahrenheit: ");
						celsuius = temp.nextDouble();
						temps = CF.celsToFahren(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Fahrenheit.");
						break;
					
					case 2: // celsuis to kelvin
						sysout("Please enter how many degrees in Celsuis you want to convert to Kelvin: ");
						celsuius = temp.nextDouble();
						temps = CF.celsToKelvin(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Kelvin.");
						break;
						
					case 3: // celsuis to Rankine
						sysout("Please enter how many degrees in Celsuis you want to convert to Rankine: ");
						celsuius = temp.nextDouble();
						temps = CF.celsToRankine(celsuius);
						sysout(celsuius + " in Celsuis is " + temps + " degrees in Rankine.");
						break;
						
					case 4: 
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(tempselect == 4) { //break from menu
						break;
						}
					}
				break; //break to main
				
				
				
			case 4://mass converter menu
				while(true) {
					sysout("Please select from the mass converter menu or enter 4 to return to the main menu\n1. Grams to Stone\n2. Grams to Pound\n3. Grams to Ounce\n4. Return to main menu");
					int massSelect = mass.nextInt();
					double grams;
					double weight;
					switch(massSelect) {
					
					case 1: //gram to stone
						sysout("Please enter how many Grams you want to convert to Stone weight: ");
						grams = mass.nextDouble();
						weight = CF.gramToStone(grams);
						sysout(grams + " in Grams is " + weight + " Stone in weight.");
						break;
					
					case 2: //gram to pound
						sysout("Please enter how many Grams you want to convert to Pounds weight: ");
						grams = mass.nextDouble();
						weight = CF.gramToPound(grams);
						sysout(grams + " in Grams is " + weight + " Pounds in weight.");
						break;
						
					case 3: //gram to ounce
						sysout("Please enter how many Grams you want to convert to Ounces weight: ");
						grams = mass.nextDouble();
						weight = CF.gramToOunce(grams);
						sysout(grams + " in Grams is " + weight + " Ounces in weight.");
						break;
						
					case 4:
						sysout("Returning to the main menu.");
						break;
					default:
						sysout("Please make a selection from the menu");
				
					}
					if(massSelect == 4) {//break loop
						break;
						}
					}
				break; //break main
				
				
				
				
			case 9:
				//close rss bfore closing program
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

	
	//basic system out println minfunction
	public static void sysout(String str) {
		System.out.println(str);
	}	
}
