import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	public String Nombre;
	public String Apellidos;
	public int Edad;
	
	public Persona (String Nombre, String Apellidos, int Edad) {
		if (Nombre.matches("[a-zA-Z].*") && Apellidos.matches("[a-zA-Z].*")){
			this.Nombre = Nombre;
			this.Apellidos = Apellidos;
			this.Edad = Edad;
		}else {
			System.out.println("Los valores introducidos no son correctos");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre, apellidos;
		int edad;
		
		System.out.println("Introduce un nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Introduce un apellido: ");
		apellidos = scanner.nextLine();
		System.out.println("Introduce una edad: ");
		edad = scanner.nextInt();
		
		
		Persona persona1 = new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona1);
		System.out.println(json);
	}
}
