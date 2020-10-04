package gsonSample;

import java.util.Scanner;

public class GsonSample {
	
	public static void main(String[] args) {
		Object[] _datos = new Object[3];
		datos(_datos);
		
		Persona per = new Persona((String) _datos[0], (String)_datos[1], (Integer)_datos[2]);
		System.out.println(per.toJSON());
	}
	
	//Metodo encargado de pedir los datos y comprobarlos
		public static void datos(Object[] _datos) {
			Scanner entrada = new Scanner(System.in);
			String datos;
			boolean datoFalso = false;
			
			//nombre
			do {
				System.out.println("Introduce nombre: ");
				datos = entrada.nextLine();
				if(datoFalso = datos.matches(".*[A-z].*")) 
					_datos[0] = datos;
				
				else 
					System.out.println("El nombre introducido es incorrecto. ");				
				
			} while(!datoFalso);
			
			//Apellidos
			do {
				System.out.println("Introduce apellidos: ");
				datos = entrada.nextLine();
				if(datoFalso = datos.matches(".*[A-z].*"))
					_datos[1] = datos;
				else
					System.out.println("El apellido introducido es incorrecto. ");
				
			} while(!datoFalso);
			
			//Edad
			do {
				System.out.println("Introduce edad ");
				datos = entrada.nextLine();
				if(datoFalso = datos.matches(".*[0-9].*")) 
					_datos[2] = Integer.parseInt(datos);
				else
					System.out.println("La edad es incorrecta ");
				
			} while(!datoFalso);
			
			entrada.close();
		}
}
