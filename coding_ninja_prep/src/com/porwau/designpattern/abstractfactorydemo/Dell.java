package com.porwau.designpattern.abstractfactorydemo;

public class Dell implements Device {

	private String screenSize;
	private String ram;
	private String gpu;

	public Dell(String screenSize, String ram, String gpu) {
		super();
		this.screenSize = screenSize;
		this.ram = ram;
		this.gpu = gpu;
	}

	public Dell() {
		// TODO Auto-generated constructor stub
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	@Override
	public String getDetails() {
		return "Dell Laptop specs: RAM is " + getRam() + ", Screen Size is " + getScreenSize() + ", GPU is " + getGpu();
	}

}
