package pti.sb_jdomeExchange.dto;

import java.util.ArrayList;
import java.util.List;


public class RatesDto {
	
	private List<RateDto> ratesDtoList;

	public RatesDto() {
		super();
		this.ratesDtoList = new ArrayList<>();
	}
	
	
	public List<RateDto> getRatesDtoList() {
		return ratesDtoList;
	}


	public void setRatesDtoList(List<RateDto> ratesDtoList) {
		this.ratesDtoList = ratesDtoList;
	}


	public void addRate(RateDto rateDto) {
		this.ratesDtoList.add(rateDto);
	}


	@Override
	public String toString() {
		return "RatesDto [ratesDtoList=" + ratesDtoList + "]";
	}


	


}
