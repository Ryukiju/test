package test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonValue {

	@JsonProperty
	public Integer id;

	@JsonProperty
	public String name;

	@JsonProperty
	public Integer input_date;

	public JsonValue() {}

	public JsonValue(Integer id, String name, Integer input_date) {
		this.id=id;
		this.name=name;
		this.input_date=input_date;
	}
}