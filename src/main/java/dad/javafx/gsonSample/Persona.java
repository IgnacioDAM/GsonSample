package dad.javafx.gsonSample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	private String nombre;
	private String apellidos;
	private Integer edad;

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	// Constructores
	public Persona() {
		this(null, null, 0);
	}

	public Persona(String nom, String apell, Integer años) {
		setNombre(nom);
		setApellidos(apell);
		setEdad(años);
	}

	// Metodos de la clase
	// Con este metodo generamos el JSON y devuelve el string en ese formato
	public String toJSON() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return (gson.toJson(this));
	}
}
