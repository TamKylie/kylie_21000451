import java.util.Random;//We want to make user of an existing class - Random

public class Weather { // a class consists of data + operation

    // data or attributes
    private float temperature;
    private float wind;
    private float humidity ;
    private float precipitation;
    
    // methods or operation : must be tightly coupled to the data
	//Constrcutor = no return type, name same as the class
	Weather(){
		//System.out.println("//Constructer is called.//");
		
	}
	
    public void generate(float TempRange[],float WindRange[], float HumidityRange[], float PrecipitationRange[]) {
		Random rand = new Random();
		temperature = rand.nextFloat() * (TempRange[1] - TempRange[0]) + TempRange[0];
		wind = rand.nextFloat() * (WindRange[1] - WindRange[0]) + WindRange[0];
		humidity = rand.nextFloat()* (HumidityRange[1] - HumidityRange[0]) + HumidityRange[0];
		precipitation = rand.nextFloat() * PrecipitationRange[1];
		
    }
	
	public void display(){
		System.out.println("Temperature: " + temperature);
		System.out.println("Wind: " + wind);
		System.out.println("Humidity: " + humidity);
		System.out.println("Precipitation " + precipitation);
	}
	
	//define setter for private attributes
	public void setTemperature(float temp){
		if (temp > 50){
			System.out.println("Error");
			//return;
		}
		temperature = temp;
	}
	
	public void setWind(float wd){
		if (wd > 50){
			System.out.println("Error");
			//return;
		}
		//the front wind is refer to the private wind and the back wind is refer to the parameter.
		wind = wd;
	}
	
	public void setHumidity(float humid){
		if (humid > 50){
			System.out.println("Error");
			//return;
		}
		humidity = humid;
	}
	
	public void setPrecipitation(float prec){
		if (prec > 50){
			System.out.println("Error");
			//return;
		}
		precipitation = prec;
	}
	
	//encapsulation
	//define getter for private attributes
	public float getTemperature(){
		return temperature;
	}
	
	public float getWind(){
		return wind;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPrecipitation(){
		return precipitation;
	}
	
	
} ;
