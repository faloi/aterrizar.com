package ar.edu.utn.frba.dds.manejoFechas.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.edu.utn.frba.dds.manejoFechas.exceptions.DateParserException;

public class SimpleDateParser implements DateParser {

	private String pattern;
	
	public SimpleDateParser(String pattern) {
		this.setPattern(pattern);
	}

	protected void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	protected String getPattern() {
		return pattern;
	}
	
	@Override
	public Date parse(String dateString) {
		try {
			return new SimpleDateFormat(getPattern()).parse(dateString);
		} catch (ParseException e) {
			throw new DateParserException("No se pudo parsear la fecha.", e);
		}
	}

	
	//TODO: tiene que haber una forma mejor de resolver esto...
	
	public static SimpleDateParser ISO8601() {
		return new SimpleDateParser("yyyy-MM-dd");
	}
	
	public static SimpleDateParser LatinAmerican() {
		return new SimpleDateParser("dd/MM/yyyy");
	}
	
	public static SimpleDateParser NorthAmerican() {
		return new SimpleDateParser("MM-dd-yyyy");
	}
}
