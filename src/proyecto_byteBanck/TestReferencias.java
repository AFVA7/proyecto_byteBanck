package proyecto_byteBanck;

public class TestReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego"); 
		cliente.setDocumento("163467546");
		cliente.setTelefono("3344444455");
		System.out.println(cliente);
		Cuenta cuentaDeDiego = new Cuenta(2, 0);
		System.out.println(cuentaDeDiego);
		cuentaDeDiego.setTitular(cliente); 
		System.out.println(cuentaDeDiego.getTitular().getNombre());
		System.out.println(cuentaDeDiego.getTitular());
		
		System.out.println(cuentaDeDiego.getTitular().getDocumento());
		System.out.println(cliente.getDocumento());
	}

}
