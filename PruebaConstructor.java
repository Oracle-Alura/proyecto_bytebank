package proyecto_bytebank;

public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(555, 123);		
		Cuenta cuenta2 = new Cuenta(333, 123);
		Cuenta cuenta3 = new Cuenta(444, 123);
		Cuenta.getTotal();
		
		System.out.println(Cuenta.getTotal());
		
		
	}

}
