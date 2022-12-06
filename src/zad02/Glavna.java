package zad02;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Makedonija");
		lista.add("Srbija");
		lista.add("Bugarija");
		lista.add("Italija");
		lista.add("Germanija");

		System.out.println("Listata sodrzhi "+ lista.size()+" elementi.");

		if(lista.size() == 3) {    
			lista.add("Francija");
			lista.add("Slovenija");

			System.out.println(lista);
		}
		else {
			System.out.println(lista);
		}
	}
}