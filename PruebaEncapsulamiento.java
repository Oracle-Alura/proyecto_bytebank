package proyecto_bytebank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(003,123);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego"); 
		cliente.setDocumento("fdfdf32323");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		
		System.out.println(titular);
		
	}

}
