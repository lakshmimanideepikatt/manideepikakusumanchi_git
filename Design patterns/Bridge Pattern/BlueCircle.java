package com.BridgePattern.BridgePattern;
public class BlueCircle implements DrawAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}