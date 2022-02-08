package lesson10.enumerations;

public enum Constants {
    FAHRENHEIT_CONST (32),
    FAHRENHEIT_COEFF (1.8),
    KELVIN_CONST (273.15);

    private double value;

    Constants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

/*package lesson10.enumerations;

public enum ScaleType {
    CELSIUS (1),
    FAHRENHEIT (2),
    KELVIN (3);

    private int value;

    ScaleType(int value) {
        this.value = value;
    }

    static ScaleType type(int value) {
        for (ScaleType scale: values()) {
            if (scale.value == value) {
                return scale;
            }
        }
        return ScaleType.CELSIUS;
    }


}
*/