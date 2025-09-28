/**
 * Interface for working with metric system measurements
 * Defines methods for getting data in metric units
 */
public interface MetricSystem {
    // Returns length in meters
    double getLengthInMeters();

    // Returns weight in kilograms
    double getWeightInKilograms();

    // Returns temperature in Celsius
    double getTemperatureInCelsius();
}