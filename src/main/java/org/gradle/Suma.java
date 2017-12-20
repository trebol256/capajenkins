package org.gradle;

public class Suma {
	
	private Integer arg01;
	private Integer arg02;
	
	public Suma() {
		return;
	}
	
	public Integer sumar(Integer a, Integer b) {
		this.arg01=a;
		this.arg02=b;
		
		return (arg01+arg02);
	}
}
