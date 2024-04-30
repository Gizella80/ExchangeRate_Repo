package pti.sb_jdomeExchange.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.stereotype.Repository;


import pti.sb_jdomeExchange.model.Rate;

@Repository
public class XMLParser {

	public List<Rate> getAllRates()throws JDOMException, IOException {
		
		List<Rate> rates = new ArrayList<>();
		
		
		SAXBuilder sb = new SAXBuilder();
		Document document = sb.build( new File("C:\\Users\\czegl\\Downloads\\MNB_ExchangeRates.xml") );
		
		
		Element rootElement = document.getRootElement();
		Element dayChildElement = rootElement.getChild("Day");
		List<Element> rateElements = dayChildElement.getChildren("Rate");
		
		for(int index = 0; index < rateElements.size(); index++) {
			Element currentRateElement = rateElements.get(index);
			String currencyUnit = currentRateElement.getAttributeValue("unit");
			String currencyName = currentRateElement.getAttributeValue("curr");
			String currencyValue = currentRateElement.getValue();
			
			Rate rate = new Rate (currencyUnit, currencyName, currencyValue);
			rates.add(rate);
		}
		
		return rates;
	}
	
	

}
