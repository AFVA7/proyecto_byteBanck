package proyecto_byteBanck;

public class CreaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta miCuenta = new Cuenta(5, 1);
		Cuenta CuentaDeZayra = new Cuenta(1550, 6, 1);
		
		miCuenta.depositar(300);
		CuentaDeZayra.depositar(1000);
		
		System.out.println(miCuenta.getSaldo());
		System.out.println(CuentaDeZayra.getSaldo());
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		boolean puedeTransferir = CuentaDeZayra.transferir(400, miCuenta);
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("error");
		}
		System.out.println(CuentaDeZayra.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
		
		
	
	}

}
