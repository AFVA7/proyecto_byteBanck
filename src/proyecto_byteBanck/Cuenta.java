package proyecto_byteBanck;

public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contador = 0;

	public Cuenta(double saldo, int agencia, int numero) {
		// TODO Auto-generated constructor stub
		if (agencia <= 0) {
			System.out.println("No se permite el 0, ni valores negativos, por tanto el número de agencia será 1");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}

		System.out.println("Creando cuenta....");
		Cuenta.contador++;
		System.out.println("El total de cuentas es: " + Cuenta.contador);

		this.numero = numero;
		this.saldo = saldo;

		System.out.println("Estoy creando la cuenta número: " + this.numero);

	}

	public Cuenta(int agencia, int número) {
		// TODO Auto-generated constructor stub
		this(1000, agencia, número);
	}

	// transacciones
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		saldo += monto;
	}

	public boolean retirar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if (saldo >= valor) {
			retirar(valor);
			cuentaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("El número no puede ser menor o igual a 0");
			return;
		}
		this.numero = numero;

	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getContador() {
		return Cuenta.contador;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular.getNombre() + "]";
	}

}
