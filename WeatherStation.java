import java.util.Scanner;


public class WeatherStation {
	//public static final int numsensors = 2;
	public int numsensors;
	WeatherList WeatherData = new WeatherList();
	
	
	public void readWeatherStationData(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Location : ");
		String location = input.nextLine();
		
		System.out.println("Reporting body : ");
		String reportingbody = input.nextLine();
		
		System.out.println("Number of sensors : ");
		numsensors = input.nextInt();
		
		for(int i = 0; i<numsensors; i++){
			System.out.println("#####Sensor " + (i+1) + " : " );
			System.out.println(" ");
			WeatherData.readWeather();
		}
	}
	
	public int sensors(int numsensors){
		int sensors = numsensors;
		return sensors;
	}
	
	public void calcStats(){
		WeatherList WeatherDat = new WeatherList();
		WeatherDat.readWeather();
		System.out.println("--------------Temperature-------------");
		System.out.println("The minimum is : " + WeatherDat.minTemp());
		System.out.println("The maximum is : " + WeatherDat.maxTemp());
		System.out.println("The average is : " + WeatherDat.avgTemp());
		System.out.println("The standard deviation is : " + WeatherDat.stdDevTemp(WeatherDat.avgTemp()));
		
		System.out.println("--------------Wind-------------");
		System.out.println("The minimum is : " + WeatherDat.minWind());
		System.out.println("The maximum is : " + WeatherDat.maxWind());
		System.out.println("The average is : " + WeatherDat.avgWind());
		System.out.println("The standard deviation is : " + WeatherDat.stdDevWind(WeatherDat.avgWind()));
	
		System.out.println("--------------Humidity-------------");
		System.out.println("The minimum is : " + WeatherDat.minHumidity());
		System.out.println("The maximum is : " + WeatherDat.maxHumidity());
		System.out.println("The average is : " + WeatherDat.avgHumidity());
		System.out.println("The standard deviation is : " + WeatherDat.stdDevHumidity(WeatherDat.avgHumidity()));
		
		System.out.println("--------------Precipitation-------------");
		System.out.println("The minimum is : " + WeatherDat.minPrecipitation());
		System.out.println("The maximum is : " + WeatherDat.maxPrecipitation());
		System.out.println("The average is : " + WeatherDat.avgPrecipitation());
		System.out.println("The standard deviation is : " + WeatherDat.stdDevPrecipitation(WeatherDat.avgPrecipitation()));
		
	}
    

}