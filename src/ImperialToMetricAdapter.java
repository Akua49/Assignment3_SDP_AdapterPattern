/**
 * Adapter for converting from imperial system to metric system
 * Implements MetricSystem interface and adapts ImperialSystem
 */
public class ImperialToMetricAdapter implements MetricSystem {
    // Constants for unit conversion
    private static final double METERS_IN_FOOT = 0.3048;      // meters in one foot
    private static final double KILOGRAMS_IN_POUND = 0.453592; // kilograms in one pound

    private final ImperialSystem imperialSystem;  // reference to adapted object

    // Constructor takes ImperialSystem object for adaptation
    public ImperialToMetricAdapter(ImperialSystem imperialSystem) {
        this.imperialSystem = imperialSystem;
    }

    // Converts feet to meters
    @Override
    public double getLengthInMeters() {
        return imperialSystem.getLengthInFeet() * METERS_IN_FOOT;
    }

    // Converts pounds to kilograms
    @Override
    public double getWeightInKilograms() {
        return imperialSystem.getWeightInPounds() * KILOGRAMS_IN_POUND;
    }

    // Converts Fahrenheit to Celsius
    @Override
    public double getTemperatureInCelsius() {
        return (imperialSystem.getTemperatureInFahrenheit() - 32) * 5 / 9;
    }
}
