# Assignment 3 - Adapter Pattern

## UML Class Diagram

```mermaid
classDiagram
    direction TB
    
    class MetricSystem {
        <<interface>>
        +getLengthInMeters() double
        +getWeightInKilograms() double
        +getTemperatureInCelsius() double
    }
    
    class ImperialSystem {
        -double feet
        -double pounds
        -double fahrenheit
        +ImperialSystem(double, double, double)
        +getLengthInFeet() double
        +getWeightInPounds() double
        +getTemperatureInFahrenheit() double
    }
    
    class ImperialToMetricAdapter {
        -double METERS_IN_FOOT = 0.3048
        -double KILOGRAMS_IN_POUND = 0.453592
        -ImperialSystem imperialSystem
        +ImperialToMetricAdapter(ImperialSystem)
        +getLengthInMeters() double
        +getWeightInKilograms() double
        +getTemperatureInCelsius() double
    }
    
    class MetricToImperialAdapter {
        -double FEET_IN_METER = 3.28084
        -double POUNDS_IN_KILOGRAM = 2.20462
        -MetricSystem metricSystem
        +MetricToImperialAdapter(MetricSystem)
        +getLengthInFeet() double
        +getWeightInPounds() double
        +getTemperatureInFahrenheit() double
    }
    
    class UnitConverterApplication {
        +main(String[]) void
        +displayMeasurements(MetricSystem) void
    }
    
    MetricSystem <|.. ImperialToMetricAdapter : implements
    ImperialToMetricAdapter --> ImperialSystem : adapts
    MetricToImperialAdapter --> MetricSystem : adapts
    UnitConverterApplication --> ImperialSystem : creates
    UnitConverterApplication --> ImperialToMetricAdapter : uses
    UnitConverterApplication --> MetricToImperialAdapter : uses
    UnitConverterApplication --> MetricSystem : depends on
