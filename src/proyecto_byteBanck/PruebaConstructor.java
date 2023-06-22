package proyecto_byteBanck;

public class PruebaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta = new Cuenta(1200, 0, 100);
		Cuenta cuenta2 = new Cuenta(1330, 3, 101);
		Cuenta cuenta3 = new Cuenta(1000,4, 102);
		Cuenta cuenta4 = new Cuenta(0, 103);
		
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente.setNombre("Andrés"); 
		cliente1.setNombre("Carlos"); 
		cliente2.setNombre("Alberto"); 
		cliente3.setNombre("José"); 
		
		cuenta.setTitular(cliente);
		cuenta2.setTitular(cliente1);
		cuenta3.setTitular(cliente2);
		cuenta4.setTitular(cliente3);
	
		
		System.out.println(cuenta.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		System.out.println(cuenta4.toString());
		System.out.println("ñ");
		
		

	}

}
