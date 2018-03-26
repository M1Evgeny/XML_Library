package by.htp.XML.runner;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.XML.model.Food;
import by.htp.XML.parser.MenuSaxHandler;

public class SaxDemo {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		MenuSaxHandler handler = new MenuSaxHandler();
		reader.setContentHandler(handler);
		reader.parse(new InputSource("resource/menu.xml"));

		List<Food> l = handler.getFoodList();
		for (Food f : l) {
			System.out.println(f);
		}
	}

}
