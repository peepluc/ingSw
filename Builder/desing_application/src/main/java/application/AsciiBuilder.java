package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class AsciiBuilder extends Builder {

	@Override
	public void building() {
		
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(super.arr));
			for(String e : super.elem) {
				for(int i = 0 ; i<e.length(); i++) {
					int x =(int) e.charAt(i);
					bw.append(Integer.toString(x));
				}
			}
			bw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
