package zad11;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> l1 =  new ArrayList<String>();
		l1.add("Bela");
		l1.add("Crvena");
		l1.add("Crna");

		List<String> l2 = new ArrayList<String>();
		l2.add("Bela");
		l2.add("Zelena");
		l2.add("Crvena");

		l1.retainAll(l2);

		System.out.println(l1);
	}
}
