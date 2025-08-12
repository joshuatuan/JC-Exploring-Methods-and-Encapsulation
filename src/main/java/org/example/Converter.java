package org.example;

public class Converter {
    public static String celsiusToFahrenheit(double celsius){
        return celsius + " degrees C is " + ((celsius * 9.0/5.0) + 32 + " degrees F.");
    }
    public static String fahrenheitToCelsius(double fahrenheit){
        return fahrenheit + " degrees F is " + (((fahrenheit - 32)  *9.0/5.0) + 32 + " degrees C.");
    }
}
