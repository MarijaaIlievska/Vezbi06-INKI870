package zad03;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("KNI");
		lista.add("INKI");
		lista.add("MIS");
		System.out.println("Pred dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(lista);

		lista.add(2, "IMSA");
		System.out.println("Po dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(lista);
	}
}
