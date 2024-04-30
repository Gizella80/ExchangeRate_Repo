package pti.sb_jdomeExchange.controller;

import java.io.IOException;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pti.sb_jdomeExchange.dto.RatesDto;
import pti.sb_jdomeExchange.service.AppService;

@Controller
public class AppController {
	
	private AppService service;

	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/exchange/{unit}")
	public String getAllRatesByUnits(
			Model model,
			@PathVariable("unit") String unit) throws JDOMException, IOException{
		
		RatesDto ratesDto = service.getAllRatesByUnit(unit);
				
		model.addAttribute("ratesdto", ratesDto);		
				return "rates.html";
			}
	
	

}
