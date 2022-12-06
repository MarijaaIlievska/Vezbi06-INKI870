package zad05;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(13);
		lista.add(14);
		lista.add(57);
		lista.add(36);
		lista.add(1);
		
		System.out.println("Vtoriot element e: "+lista.get(1));
	}
}
