package ro.cts.clase;

import ro.cts.readere.AngajatiReader;
import ro.cts.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new AngajatiReader();


		try {
			listaAplicanti = aplicantReader.readAplicanti("C:\\Users\\olivi\\Downloads\\seminar2_1098\\seminar2\\angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
