package proyecto_byteBanck;

public class Cliente {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
		System.out.println("Aquí se inicia un cliente");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
