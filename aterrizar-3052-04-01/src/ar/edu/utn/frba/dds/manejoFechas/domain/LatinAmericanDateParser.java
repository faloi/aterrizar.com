package ar.edu.utn.frba.dds.manejoFechas.domain;

public class LatinAmericanDateParser extends SimpleDateParser {

	public LatinAmericanDateParser(){
		this.setPattern("dd/MM/yyyy");
	}
	
}
