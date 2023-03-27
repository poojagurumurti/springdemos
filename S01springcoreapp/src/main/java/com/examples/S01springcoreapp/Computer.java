package com.examples.S01springcoreapp;

public class Computer {
	int cpu;
	String memory;
	String storage;
	public Computer(int cpu, String memory, String storage) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Computer [cpucores=" + cpu + ", memorySize=" + memory + ", storageSize=" + storage + "]";
	}
	
	
	
	
}
