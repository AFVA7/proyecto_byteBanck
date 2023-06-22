package proyecto_byteBanck;

public class Referencias {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(2, 0);
		Cuenta seguntaCuenta = new Cuenta(3, 0);
		primeraCuenta.depositar(400);
		seguntaCuenta.depositar(400);
		if(primeraCuenta == seguntaCuenta) {
			System.out.println("son el mismo objeto");
		}else {
			System.out.println("Son diferentes");
		}
	}
	


}
