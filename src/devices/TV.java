package devices;

public class TV{
    private int channel = 1;
    private boolean isOn = false;

    public void turnOn(){
        this.isOn = true;
        System.out.println("TV is turned ON. Current channel: " + channel);
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("TV is turned OFF.");
    }

    public void setChannel(int channel){
        if (isOn){
            this.channel = channel;
            System.out.println("TV channel set to " + channel);
        } else {
            System.out.println("TV is OFF. Please turn it ON to change the channel.");
        }
    }

    public int getChannel() {
        return channel;
    }
}