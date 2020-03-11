package model;

public class Model {

    public double convertFahrenheitToCelcius(double inputFahrenheitTemperature) {

        return (inputFahrenheitTemperature - 32) / 1.8000;
    }

    public double convertCelciusToFahrenheit(double inputCelciusTemperature) {

        return inputCelciusTemperature * 1.8000 + 32;
    }
}
