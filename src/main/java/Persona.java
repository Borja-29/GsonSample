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
		
		Persona persona1 = new Persona("Borja", "Diaz", 20);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona1);
		System.out.println(json);
	}
}
