

import Dto.UtenteDTO;

import java.util.Objects;

public class Main {

	public static void main (String[] args){
		UtenteDTO u1 = new UtenteDTO();
		UtenteDTO u2 = new UtenteDTO("Peppino", "deBellis");
		UtenteDTO u3 = new UtenteDTO("Peppino", "deBellis");
		UtenteDTO u4 = new UtenteDTO("Pinco", "pallo");

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());

		System.out.println();

		System.out.println("u2 e u3 sono uguali? " + u2.equals(u3));
		System.out.println();

		System.out.println("u1 e u2 sono uguali? " + u1.equals(u3));

		System.out.println();

		System.out.println("u3 e u4 sono uguali? " + u3.equals(u4));
		System.out.println();

		boolean test = Objects.equals(u3.getId(), u4.getId());

		System.out.println("u3.id e u4.id sono uguali? " + test);
	}
}
