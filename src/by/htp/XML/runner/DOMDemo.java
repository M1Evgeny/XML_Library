package by.htp.XML.runner;

import java.util.List;

import by.htp.XML.model.Food;
import by.htp.XML.parser.FoodDOMBuilder;

public class DOMDemo {

	public static final String PATH = "resource/menu.xml";

	public static void main(String[] args) {
		FoodDOMBuilder domBuilder = new FoodDOMBuilder();
		domBuilder.buildListFood(PATH);
		
		List<Food> list = domBuilder.getFood();
		for(Food f: list){
		System.out.println(f);
		}
	}

}
