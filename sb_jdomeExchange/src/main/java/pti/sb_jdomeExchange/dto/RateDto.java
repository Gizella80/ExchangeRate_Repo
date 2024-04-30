package pti.sb_jdomeExchange.dto;

public class RateDto {
	
	private String unit;
	private String name;
	private String value;
	
	public RateDto(String unit, String name, String value) {
		super();
		this.unit = unit;
		this.name = name;
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "RateDto [unit=" + unit + ", name=" + name + ", value=" + value + "]";
	}
	

}
