import service.HumidityDisplay;
import service.TempDisplay;
import service.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TempDisplay tempDisplay = new TempDisplay(weatherStation);
        HumidityDisplay humidityDisplay= new HumidityDisplay(weatherStation);
        weatherStation.setWeatherParameters(12, 3);
    }
}