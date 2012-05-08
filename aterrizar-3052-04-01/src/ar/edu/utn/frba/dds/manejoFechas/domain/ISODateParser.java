package ar.edu.utn.frba.dds.manejoFechas.domain;

public class ISODateParser extends SimpleDateParser {
	
	public ISODateParser(){
		this.setPattern("yyyy-MM-dd"); 
	}
	
}
