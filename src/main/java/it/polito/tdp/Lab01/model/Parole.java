package it.polito.tdp.Lab01.model;

import java.util.List;
import java.util.*;

public class Parole {
		
	private List<String> parole;
	
	
	public Parole() {

		this.parole = new ArrayList<String>();
		
	}
	
	public void addParola(String p) {
		this.parole.add(p);
		
		
	}
	
	public List<String> getElenco() {
		//TODO
		
		List<String> lista = new ArrayList<String>(this.parole);
		
		Collections.sort(lista, new StringComparator());
		
		return lista;
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	
	public void cancellaParola(String p) {
		
		if(parole.contains(p)) {
			this.parole.remove(p);
		}
		
	}

	
}
