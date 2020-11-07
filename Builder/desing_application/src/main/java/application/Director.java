package application;

import java.io.File;

public class Director  {
	private Builder b;
	
	public Director(Builder b) {
		this.b = b;
	}
	
	public void buildObj(File input) {
		this.b.parsing(input);
		this.b.building();
	}
	
}
