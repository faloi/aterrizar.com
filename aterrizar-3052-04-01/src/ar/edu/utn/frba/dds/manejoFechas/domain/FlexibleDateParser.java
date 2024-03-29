package ar.edu.utn.frba.dds.manejoFechas.domain;

import java.util.Collection;
import java.util.Date;

import ar.edu.utn.frba.dds.manejoFechas.exceptions.DateParserException;

public class FlexibleDateParser implements DateParser {

	private Collection<DateParser> dateParsers;
	
	public FlexibleDateParser(Collection<DateParser> dataParsers)
	{
		this.setDateParsers(dataParsers);
	}
	
	@Override
	public Date parse(String dateString){
		for (DateParser dp : this.getDateParsers()) {
			try {
				return dp.parse(dateString);
			} catch (DateParserException e) {
				continue;
			}
		}
		
		throw new DateParserException("No se pudo parsear la fecha con ninguno de los formatos disponibles");		
	}

	private void setDateParsers(Collection<DateParser> dateParsers) {
		this.dateParsers = dateParsers;
	}

	private Collection<DateParser> getDateParsers() {
		return dateParsers;
	}
	
}
