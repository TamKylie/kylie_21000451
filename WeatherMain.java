public class WeatherMain{
	
	public static void main(String args[]) {
		WeatherStationList wsl = new WeatherStationList();
		
		wsl.input();
		System.out.println(" ");
		System.out.println("------------------------Summary-------------------------");
		wsl.calcMaxNumSensors();
		wsl.calcMinNumSensors();
		wsl.calcAvgNumSensors();
		
	}
	
}