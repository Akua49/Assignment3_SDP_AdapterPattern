/**
 * Adapter for converting from metric system to imperial system
 * Provides reverse conversion of data
 */
public class MetricToImperialAdapter {
    // Constants for reverse conversion
    private static final double FEET_IN_METER = 3.28084;      // feet in one meter
    private static final double POUNDS_IN_KILOGRAM = 2.20462; // pounds in one kilogram

    private final MetricSystem metricSystem;  // reference to adapted object

    // Constructor takes MetricSystem object for adaptation
    public MetricToImperialAdapter(MetricSystem metricSystem) {
        this.metricSystem = metricSystem;
    }

    // Converts meters to feet
    public double getLengthInFeet() {
        return metricSystem.getLengthInMeters() * FEET_IN_METER;
    }

    // Converts kilograms to pounds
    public double getWeightInPounds() {
        return metricSystem.getWeightInKilograms() * POUNDS_IN_KILOGRAM;
    }

    // Converts Celsius to Fahrenheit
    public double getTemperatureInFahrenheit() {
        return (metricSystem.getTemperatureInCelsius() * 9 / 5) + 32;
    }
}
