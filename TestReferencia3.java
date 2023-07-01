package proyecto_bytebank;

public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta(011,123);			
		System.out.println(cuentaDeDiego.getTitular().getNombre());	
		
		Cuenta cuentaDeMarcela = new Cuenta(012,123);
		//cuentaDeMarcela.titular = new Cliente();
		//cuentaDeMarcela.titular.nombre = "Marcela";
		
		System.out.println(cuentaDeMarcela.getTitular());
		
		
	}

}
