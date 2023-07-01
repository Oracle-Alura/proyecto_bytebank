package proyecto_bytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(006,123);
		//primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(100);
		
		System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(400);
		System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		
	}
	// Ambas cuentas hacen referencia al mismo espacio de memoria, por eso el saldo de una cuenta afecta a la otra.

}
