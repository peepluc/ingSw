package application;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

abstract public class Builder {
	protected File arr = new File("titolo.txt");
	protected ArrayList<String> elem = new ArrayList<String>();
	
	
	public final void parsing(File input){
		
		Document doc;
		try {
			doc=Jsoup.parse(input,null);
			Elements ids = doc.select("div,h1,h2,h3,h4,h5,ul,li,ol,p,title");
			for(Element id : ids) {
				elem.add(id.text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	abstract public void building();
	
	final public File getResult()
	{
		return arr;
	}

	
}
