/**
 * Main application class for demonstrating adapters work
 * Contains program entry point and methods for displaying results
 */
public class UnitConverterApplication {

    // Main program method
    public static void main(String[] args) {
        // Create object with data in imperial system
        ImperialSystem imperialData = new ImperialSystem(8, 100, 90);

        // Adapt imperial data to metric system
        MetricSystem adaptedToMetric = new ImperialToMetricAdapter(imperialData);

        // Demonstrate conversion from imperial to metric system
        System.out.println("Imperial to Metric Conversion:");
        displayMeasurements(adaptedToMetric);

        // Demonstrate reverse conversion from metric to imperial system
        System.out.println("\nMetric to Imperial Conversion:");
        MetricToImperialAdapter adaptedToImperial = new MetricToImperialAdapter(adaptedToMetric);

        // Display reverse conversion results
        System.out.printf("Length: %.2f feet%n", adaptedToImperial.getLengthInFeet());
        System.out.printf("Weight: %.2f pounds%n", adaptedToImperial.getWeightInPounds());
        System.out.printf("Temperature: %.2f °F%n", adaptedToImperial.getTemperatureInFahrenheit());
    }

    /**
     * Method for displaying measurements in metric system
     * @param metricSystem object with data in metric system
     */
    public static void displayMeasurements(MetricSystem metricSystem) {
        System.out.printf("Length: %.2f meters%n", metricSystem.getLengthInMeters());
        System.out.printf("Weight: %.2f kilograms%n", metricSystem.getWeightInKilograms());
        System.out.printf("Temperature: %.2f °C%n", metricSystem.getTemperatureInCelsius());
    }
}