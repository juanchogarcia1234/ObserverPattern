
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditions currentConditions = new CurrentConditions(weatherData);
		
		weatherData.setMeasurements(30, 56, 30.4f);
		
	}

}
