package examen;

public abstract class Persona {
	private int edad;
	private String nombre;
	private String codigo;
	private String email;
	
	public abstract void nadar();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(int edad, String nombre, String codigo, String email) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.codigo = codigo;
		this.email = email;
	}
	

}
