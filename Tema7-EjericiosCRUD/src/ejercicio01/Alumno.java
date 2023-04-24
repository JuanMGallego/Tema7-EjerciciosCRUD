package ejercicio01;

public class Alumno {

	String nombre;
	double notaMedia;
	
	public Alumno () {
		
	}

	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public boolean setNotaMedia(double valor) {
		
		boolean valid = false;
		
		if (valor >= 0 || valor <= 10) {
		
			notaMedia = valor;
			
		}
		
		return valid;
			
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public double getNotaMedia() {
		
		return notaMedia;
		
	}
	
	@Override
	public String toString() {
		
		return nombre + " " + notaMedia;
		
	}
	
}
