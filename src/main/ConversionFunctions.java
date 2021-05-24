package main;

public class ConversionFunctions {
	
	
	//Energy converters 
	public double joulToBTU(double i) {
		double joul = i*.000947817;
		return joul;
	}
	public double joulToFP(double i) {
		double joul = i*.737562;
		return joul;
	}
	public double joulToCal(double i) {
		double joul = i*.239006;
		return joul;
	}
	//distance converters
	public double meterToMile(double i) {
		double meters = i*.000621371;
		return meters;
	}
	public double meterToFeet(double i) {
		double meters = i*3.281;
		return meters;
	}
	public double meterToInch(double i) {
		double meters = i*39.37;
		return meters;
	}
	
	//Temp converters
	public double celsToFahren(double i) {
		double fahren = (i*1.8) + 32;
		return fahren;
	}
	public double celsToKelvin(double i) {
		double kelvin = i + 273.15;
		return kelvin;
	}
	public double celsToRankine(double i) {
		double rankine = (i*1.8) + 491.67;
		return rankine;
	}
	
	//Mass converters
	public double gramToStone(double i) {
		double stone = (i*.000157473);
		return stone;
	}
	public double gramToPound(double i) {
		double lbs = (i*.00220462);
		return lbs;
	}
	public double gramToOunce(double i) {
		double oz = (i*.035274);
		return oz;
	}
}
