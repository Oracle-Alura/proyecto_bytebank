package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		//Variable			 = Valor
		Cuenta primeraCuenta = new Cuenta(001,123);
        primeraCuenta.depositar(200);
        System.out.println(primeraCuenta.getSaldo());

        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(400);

        System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

	}

}
