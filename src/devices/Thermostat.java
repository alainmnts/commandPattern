package devices;

public class Thermostat {
    private int temperature = 20; // Default temperature in Celsius

    public void setTemperature(int temp){
        this.temperature = temp;
        System.out.println("Thermostat temperature set to: " + temperature + "°C");
    }
    public int getTemperature(){
        return temperature;
    }
}