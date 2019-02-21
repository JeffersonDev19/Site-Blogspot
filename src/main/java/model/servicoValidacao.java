package model;

import java.util.ArrayList;
import java.util.List;

public class servicoValidacao {
	
	public boolean validarNaoXingamento(String string) {
		
		List<String> verifica = new ArrayList<String>();
		verifica.add("cu");
		verifica.add("puta");
		verifica.add("viado");
		verifica.add("caralho");
		verifica.add("penis");
		verifica.add("buceta");
		verifica.add("arrombado");
		
		if(verifica.contains(string)) {
			return false;
		}
		else {
			return true;
		}
	}
}
