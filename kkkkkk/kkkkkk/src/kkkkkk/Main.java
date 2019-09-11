package kkkkkk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Persona> personas = new HashMap<String, Persona>();
		Persona persona1 = new Persona("Juan", "ZPerez", 23);
		persona1.setId(1);
		Persona persona2 = new Persona("Juan2", "Perez", 44);
		persona2.setId(2);
		Persona persona3 = new Persona("Juan3", "APerez3", 15);
		persona3.setId(3);
		personas.put("1111", persona1);
		personas.put("1211", persona2);
		personas.put("1141", persona3);
		
		ArrayList<Persona> array = new ArrayList<Persona>();
		array.add(persona3);
		array.add(persona1);
		array.add(persona2);
		
		Collections.sort(array, new ApellidoComparator());
		
		for (Persona persona : array) {
			System.out.println(persona.getId());
		}
		
		//System.out.println(personas.get("1211").getNombre());
//		Set<String> claves = personas.keySet();
//		for (String string : claves) {
//			System.out.println(personas.get(string).getNombre());
//		}
//		
		
		

	}

}
