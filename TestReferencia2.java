package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("12345678");
		diego.setTelefono("9911223344");
		
		Cuenta cuentaDeDiego = new Cuenta(007,123);
		//cuentaDeDiego.setAgencia(1); La agencia se determina al crear la cuenta.
		cuentaDeDiego.setTitular(diego); //Creo la relación entre el cliente diego y la cuentaDeDiego
		
		System.out.println(cuentaDeDiego.getTitular().getDocumento());		
		System.out.println(cuentaDeDiego.getTitular());
		System.out.println(diego);
	}

}
