/**
 * Class representing data in imperial system measurements
 * Stores values in feet, pounds and Fahrenheit degrees
 */
public class ImperialSystem {
    private final double feet;        // length in feet
    private final double pounds;      // weight in pounds
    private final double fahrenheit;  // temperature in Fahrenheit

    // Constructor for initializing imperial system data
    public ImperialSystem(double lengthInFeet, double weightInPounds, double temperatureInFahrenheit) {
        this.feet = lengthInFeet;
        this.pounds = weightInPounds;
        this.fahrenheit = temperatureInFahrenheit;
    }

    // Getter for length in feet
    public double getLengthInFeet() { return feet; }

    // Getter for weight in pounds
    public double getWeightInPounds() { return pounds; }

    // Getter for temperature in Fahrenheit
    public double getTemperatureInFahrenheit() { return fahrenheit; }
}