package ar.edu.utn.frba.dds.manejoFechas.domain;

public class NorthAmericanDateParser extends SimpleDateParser {
	
	public NorthAmericanDateParser(){
		this.setPattern("MM-dd-yyyy");
	}
	
}
