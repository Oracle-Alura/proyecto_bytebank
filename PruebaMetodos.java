package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(004,123);
		//miCuenta.saldo = 300;
		miCuenta.depositar(200);

		System.out.println(miCuenta.getSaldo());

		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());

		Cuenta cuentaDeJimena = new Cuenta(005,123);
		cuentaDeJimena.depositar(1000);

		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);

		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}

		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}

}
