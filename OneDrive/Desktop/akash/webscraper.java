import org.Jsoup.Jsoup;
import org.Jsoup.nodes.Document;
import org.Jsoup.nodes.Element;
import org.Jsoup.select.Element;
import java.io.IOException;
	public class webscraper
	{
	
	public static void main(String[] args) 
	{
		try{
			Document doc=Jsoup.connect("https://www.javapoint.com").get();
			Element title=doc.select("h2.title");
			for(Element title:titles){
				System.out.println(title.text());}
	}catch(IOException e){

		e.printStackTrace();
	}
}
	}
