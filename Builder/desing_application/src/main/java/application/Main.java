package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	
	private static ArrayList<String> parse(File input) {
		ArrayList<String> elem = new ArrayList<String>();
		
		Document doc;
		try {
			doc=Jsoup.parse(input,null);
			Elements ids = doc.select("div,h1,h2,h3,h4,h5,ul,li,ol,p");
			//ids = doc.select("title");
			for(Element id : ids) {
				elem.add(id.text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elem;
	}

	public static void main(String[] args) throws IOException {
		File input = new File("src/main/java/input.txt");
		//Document doc = Jsoup.parse(input,null);
		
		
		Builder b = new AsciiBuilder();
		Director d = new Director(b);
		d.buildObj(input);
		
		
		
		}
	
	
		
	}

