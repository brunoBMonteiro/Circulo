/**
 * 
 */
package com.example.demo;

/**
 * @author Bruno
 *
 */
public class Circle {
	
	private double raio;

	
	private static final double PI = 3.14159;

	public Circle(double raio) {
		super();
		if (raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}

	
	public Double getArea() {
		return raio * raio * PI;
	}
	
	public Double getRaio() {
		return this.raio;
	}


	@Override
	public String toString() {
		return "Circle [raio=" + raio + "]";
	}

	
}	