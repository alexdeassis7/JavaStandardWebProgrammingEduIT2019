package kkkkkk;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNumero() - o2.getNumero();
	}

}
