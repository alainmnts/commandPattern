package devices;

public class Light {
    private int brightness = 0;

    public void turnOn() {
        this.brightness = 100;
        System.out.println("Light is turned ON at " + brightness + "% brightness.");
    }

    public void turnOff(){
        this.brightness = 0;
        System.out.println("Light is turned OFF.");
    }

    public void setBrightness(int level){
        if(level < 0 || level > 100){
            System.out.println("Brightness level must be between 0 and 100.");
            return;
        }
        this.brightness = level;
        System.out.println("Light brightness set to " + brightness + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}