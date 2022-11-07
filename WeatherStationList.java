public class WeatherStationList {
	public static final int NUMSTATIONS = 2;

	public WeatherStation stations[] = new WeatherStation[NUMSTATIONS];
	
	public int calcMaxNumSensors(){
		int data = 0;
		int max=0;
		for(int i=0; i<NUMSTATIONS; i++){
			if(stations[i].numsensors > max){
				max = stations[i].numsensors;
				data = i+1;
			}
		}
		System.out.println("The station that has the maximum number of sensors is : Station " + data +" with " + max + " sensors. ");
		return 0;
	}
	
	public int calcMinNumSensors(){
		int data = 0;
		int min=1000000;
		for(int i=0; i<NUMSTATIONS; i++){
			if(stations[i].numsensors < min){
				min = stations[i].numsensors;
				data = i+1;
			}
		}
		System.out.println("The station that has the minimum number of sensors is : Station " + data +" with " + min + " sensors. ");
		return 0;
	}
	
	public int calcAvgNumSensors(){
		float total = 0,avg;
		for (int i= 0; i<NUMSTATIONS; i++){
			total += stations[i].numsensors;
		}
		avg = total /NUMSTATIONS;
		
		System.out.println("The average number of sensors is : " + avg + " sensors.");
		return 0;
	}
	
	public void input(){
		for( int i=0; i<NUMSTATIONS; i++){
			stations[i] = new WeatherStation();
			stations[i].readWeatherStationData();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("~~~~~Location "+ (i+1) + " : ");
			stations[i].calcStats();
			
		}
	}
}