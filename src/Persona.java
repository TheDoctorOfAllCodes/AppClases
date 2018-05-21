
public class Persona {
	/*
	 * Las variables de la clase representan los campos de estado:
	 */
	private String nombre;
	private int edad;
	private String direccion;
	
	/*
	 * El siguiente método se conoce como "Constructor".
	 * Es llamado para crear un objeto a partir de la clase.
	 * Los valores que se reciben entre paréntesis en la firma de un método
	 * son llamados "parámetros", son valores que se deben proporcionar al momento
	 * de hacer la llamada al método.
	 */
	public Persona(String pNombre, int pEdad, String pDireccion){
		this.nombre = pNombre;
		this.edad = pEdad;
		this.direccion = pDireccion;
	}
	/*
	 * El siguiente método aumentará en 1 el valor de edad cada vez que se lo llame.
	 * Corresponde al comportamiento de cumplir años.
	 */
	public void cumplirAnios(){
		this.edad = this.edad+1;
	}
	//Los siguientes métodos serán llamados para conocer la información de las variables privadas:
	public String Nombre(){return this.nombre;}
	public int Edad(){return this.edad;}
	public String Direccion(){return this.direccion;}
}
