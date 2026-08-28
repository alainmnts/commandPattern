package invokers;
import devices.*;
import commands.*;
import invokers.RemoteControl;

import devices.Light;

public class SmartHomeSystem {
    public static void main(String[] args) {
    Light light = new Light();
    Thermostat thermostat = new Thermostat();
    MusicPlayer musicPlayer = new MusicPlayer("Default Playlist");
    TV tv = new TV();

    RemoteControl remote = new RemoteControl();
    
    System.out.println("--- Executing Commands ---");

    remote.setCommand(new LightOnCommand(light));
    remote.pressButton();

    remote.setCommand(new IncreaseTempCommand(thermostat, 5));
    remote.pressButton();

    remote.setCommand(new PlayMusicCommand(musicPlayer, "Top Hits Playlist"));
    remote.pressButton();

    remote.setCommand(new TVOnCommand(tv));
    remote.pressButton();

    remote.setCommand(new ChangeChannelCommand(tv, 11));
    remote.pressButton();

    remote.setCommand(new LightOffCommand(light));
    remote.pressButton();
    }
}