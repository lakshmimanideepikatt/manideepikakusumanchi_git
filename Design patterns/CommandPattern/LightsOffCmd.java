package com.CommandPattern.CommandPattern;
public class LightsOffCmd implements Command{
	  //reference to the light
	  Light light;
	  public LightsOffCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	  }
	}