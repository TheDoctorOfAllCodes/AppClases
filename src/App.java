
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos dos objetos de la clase Persona:
		Persona p1 = new Persona("Pepe",24,"Barrio Sésamo");
		Persona p2 = new Persona("Amy",10,"Marte");
		
		//Ahora mostramos la información de nuestros objetos:
		mostrarInformacion(p1,p2);
		
		//Hacemos que Pepe cumpla años:
		p1.cumplirAnios();
		
		//Y volvemos a mostrar la información (Pepe un año más viejo!):
		mostrarInformacion(p1,p2);
		
		
	}
	public static void mostrarInformacion(Persona p1, Persona p2){
		System.out.println("Persona 1: "+ p1.Nombre() 
				+ ", edad: " + p1.Edad() + " años, dirección: "
				+ p1.Direccion() + ".");
		System.out.println("Persona 2: "+ p2.Nombre() 
				+ ", edad: " + p2.Edad() + " años, dirección: "
				+ p2.Direccion() + ".");
	}

}
