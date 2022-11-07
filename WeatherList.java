import java.lang.Math;

public class WeatherList{
	
	public static final int NUMDATA = 5;
    Weather[] weather = new Weather[NUMDATA];
	
	
	public void readWeather(){
		for (int i=0; i<NUMDATA; i++) {
			float TempRange[] =  {20, 40};
			float WindRange[] =  {20, 40};
			float HumidityRange[] = {20,40};
			float PrecipitationRange[] = {0,100};
		  
			System.out.println("###Data " + (i+1) + " : ");
			weather[i] = new Weather();  
			
			weather[i].generate(TempRange, WindRange, HumidityRange, PrecipitationRange);
			weather[i].display();
			System.out.println(" ");
		}
	}
	

	public float minTemp(){
		float min = weather[0].getTemperature();
		for(int i=0; i<NUMDATA; i++){
			if(min > weather[i].getTemperature()){
				min = weather[i].getTemperature();
			}
		}
		return min;
	}
	
	public float minWind(){
		float min = weather[0].getWind();
		for(int i=0; i<NUMDATA; i++){
			if(min > weather[i].getWind()){
				min = weather[i].getWind();
			}
		}
		return min;
	}
	
	public float minHumidity(){
		float min = weather[0].getHumidity();
		for(int i=0; i<NUMDATA; i++){
			if(min > weather[i].getHumidity()){
				min = weather[i].getHumidity();
			}
		}
		return min;
	}
	
	public float minPrecipitation(){
		float min = weather[0].getPrecipitation();
		for(int i=0; i<NUMDATA; i++){
			if(min > weather[i].getPrecipitation()){
				min = weather[i].getPrecipitation();
			}
		}
		return min;
	}
	
	public float maxTemp(){
		float max = weather[0].getTemperature();
		for(int i=0; i<NUMDATA; i++){
			if(max < weather[i].getTemperature()){
				max = weather[i].getTemperature();
			}
		}
		return max;
	}
	
	public float maxWind(){
		float max = weather[0].getWind();
		for(int i=0; i<NUMDATA; i++){
			if(max < weather[i].getWind()){
				max = weather[i].getWind();
			}
		}
		return max;
	}
	
	public float maxHumidity(){
		float max = weather[0].getHumidity();
		for(int i=0; i<NUMDATA; i++){
			if(max < weather[i].getHumidity()){
				max = weather[i].getHumidity();
			}
		}
		return max;
	}
	
	public float maxPrecipitation(){
		float max = weather[0].getPrecipitation();
		for(int i=0; i<NUMDATA; i++){
			if(max < weather[i].getPrecipitation()){
				max = weather[i].getPrecipitation();
			}
		}
		return max;
	}
	
	public float avgTemp(){
		float sum = 0;
		for(int i=0; i<NUMDATA; i++){
			sum += weather[i].getTemperature();
		}
		float avg = sum / NUMDATA;
		return avg;
	}
	
	public float avgWind(){
		float sum = 0;
		for(int i=0; i<NUMDATA; i++){
			sum += weather[i].getWind();
		}
		float avg = sum / NUMDATA;
		return avg;
	}
	
	public float avgHumidity(){
		float sum = 0;
		for(int i=0; i<NUMDATA; i++){
			sum += weather[i].getHumidity();
		}
		float avg = sum / NUMDATA;
		return avg;
	}
	
	public float avgPrecipitation(){
		float sum = 0;
		for(int i=0; i<NUMDATA; i++){
			sum += weather[i].getPrecipitation();
		}
		float avg = sum / NUMDATA;
		return avg;
	}
	
	public float stdDevTemp(float avg){
		float std_dev = 0;
		
		for(int i=0; i<NUMDATA; i++){
			std_dev += Math.pow(weather[i].getTemperature() - avg, 2);
		}
		std_dev /= NUMDATA -1; 
		float answer = (float) Math.sqrt(std_dev);
		
		return answer;
	}
	
	public float stdDevWind(float avg){
		float std_dev = 0;
		
		for(int i=0; i<NUMDATA; i++){
			std_dev += Math.pow(weather[i].getWind() - avg, 2);
		}
		std_dev /= NUMDATA -1; 
		float answer = (float) Math.sqrt(std_dev);
		
		return answer;
	}
	
	public float stdDevHumidity(float avg){
		float std_dev = 0;
		
		for(int i=0; i<NUMDATA; i++){
			std_dev += Math.pow(weather[i].getHumidity() - avg, 2);
		}
		std_dev /= NUMDATA -1; 
		float answer = (float) Math.sqrt(std_dev);
		
		return answer;
	}
	
	public float stdDevPrecipitation(float avg){
		float std_dev = 0;
		
		for(int i=0; i<NUMDATA; i++){
			std_dev += Math.pow(weather[i].getPrecipitation() - avg, 2);
		}
		std_dev /= NUMDATA -1; 
		float answer = (float) Math.sqrt(std_dev);
		
		return answer;
	}
	

}