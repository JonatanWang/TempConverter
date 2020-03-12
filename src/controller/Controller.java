package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import model.Model;

import java.text.DecimalFormat;

public class Controller {

    @FXML
    private Label fahrenheitLabel;

    @FXML
    private Slider slider;

    @FXML
    private Label celsiusLabel;

    @FXML
    private TextField fahrenheitTextField;

    @FXML
    private TextField celsiusTextField;

    private Model model = new Model();

    private static DecimalFormat twoDecimalPlacesFormater = new DecimalFormat("#.##");

    private ChangeListener<Number> listener = new ChangeListener<>() {
        @Override
        public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {

            double fahrenheitTemperature = newValue.doubleValue();
            String formattedFahrenheitTemperature = String.valueOf(twoDecimalPlacesFormater.format(fahrenheitTemperature));
            fahrenheitTextField.setText(formattedFahrenheitTemperature);

            double celciusTemperature = model.convertFahrenheitToCelcius(fahrenheitTemperature);
            String formattedCelciusTemperature = String.valueOf(twoDecimalPlacesFormater.format(celciusTemperature));
            celsiusTextField.setText(formattedCelciusTemperature);

            // Console output
            System.out.println("Fahrenheit: " + formattedFahrenheitTemperature);
            System.out.println("Celcius: " + formattedCelciusTemperature);
            System.out.println("\n");
        }
    };

    public void initialize() {

        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(1);
        slider.valueProperty().addListener(listener);
    }
}
