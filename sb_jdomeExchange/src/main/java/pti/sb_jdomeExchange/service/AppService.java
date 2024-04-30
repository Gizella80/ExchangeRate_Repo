package pti.sb_jdomeExchange.service;

import java.io.IOException;
import java.util.List;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pti.sb_jdomeExchange.dto.RateDto;
import pti.sb_jdomeExchange.dto.RatesDto;
import pti.sb_jdomeExchange.model.Rate;
import pti.sb_jdomeExchange.parser.XMLParser;

@Service
public class AppService {
	
	private XMLParser parser;
	
	@Autowired
	public AppService(XMLParser parser) {
		super();
		this.parser = parser;
	}

	public RatesDto getAllRatesByUnit(String unit) throws JDOMException, IOException {
		
		RatesDto ratesDto = new RatesDto() ;
		
		
		List<Rate> rates = parser.getAllRates();
		
		for(int index = 0; index < rates.size(); index++) {
			RateDto rateDto = null;
			Rate currentRate = rates.get(index);
			if(currentRate.getUnit().equals(unit)) {
				
				rateDto = new RateDto(
						currentRate.getUnit(),
						currentRate.getName(),
						currentRate.getValue());
				
				ratesDto.addRate(rateDto);
				}
				
			
		}
		
		return ratesDto;
	}
	
	

}
