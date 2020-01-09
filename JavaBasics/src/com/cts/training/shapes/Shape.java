package com.cts.training.shapes;

import java.awt.Color;

// base class
abstract public class Shape {
	
	// default
	int x_coordinate, y_coordinate;
	double area, perimeter;
	Color borderColor, fillColor;
	int fillStyle, borderStyle;
	
	public void getCoordinates() {
		
	}
	public void getBorderDetails() {
		
	}
	public void getFillDetails() {
		
	}
	
	public abstract void calcArea();
	public abstract void calcPerimeter();
	public abstract void draw();
}
