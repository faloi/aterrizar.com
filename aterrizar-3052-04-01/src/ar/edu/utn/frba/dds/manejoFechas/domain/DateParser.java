package ar.edu.utn.frba.dds.manejoFechas.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.edu.utn.frba.dds.manejoFechas.exceptions.DateParserException;

public abstract class DateParser {

	private String pattern;
	
	public Date parse(String dateString) {
		try {
			return new SimpleDateFormat(getPattern()).parse(dateString);
		} catch (ParseException e) {
			throw new DateParserException("No se pudo parsear la fecha.", e);
		}
	}

	protected void setPattern(String pattern) {
		this.pattern = pattern;
	}

	protected String getPattern() {
		return pattern;
	}
	
}
