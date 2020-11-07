package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class StarBuilder extends Builder {

	@Override
	public void building() {
		
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(super.arr));
			for(String e : super.elem) {
				bw.append(e);
				bw.newLine();
			}
			bw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
