package com.CommandPattern.CommandPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {RemoteControl control = new RemoteControl();
    Light light = new Light();
    Command lightsOn = new LightsOnCmd(light);
    Command lightsOff = new LightsOffCmd(light);
    control.setCommand(lightsOn);
    control.pressButton();
    control.setCommand(lightsOff);
    control.pressButton();
    }
}
