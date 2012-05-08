package ar.edu.utn.frba.dds.manejoFechas.domain;

import java.util.Date;

public interface DateParser {

	public abstract Date parse(String dateString);

}