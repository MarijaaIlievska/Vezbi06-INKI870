package zad04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(6);
		lista.add(315);
		lista.add(214);
		lista.add(361);
		lista.add(1);
				
		Collections.sort(lista);	
		
		System.out.println(lista);
	}
}