package proyecto_bytebank;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();	//La cuenta está referenciando a un cliente que va a ser su titular
	private static int total = 0; // Static, significa que esta variable no es de la instancia, sinó de la clase.
	
	//Este metodo retorna el objeto Cuenta. Este es un CONSTRUCTOR.		
	public Cuenta(int agencia,int numero) {		
		if (agencia <= 0) {
			System.out.println("No se permite 0 o negativo");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
			this.numero = numero;
		}
		total ++;
		
		System.out.println("Se van creando: " + total + " cuentas.");
	
	}

	// No retorna valor
	public void depositar(double valor) {		
		this.saldo += valor;
	}

	// Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	//Getter Saldo
	public double getSaldo(){
		return this.saldo;
	}
	
	
	//Setter Numero
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Getter Numero
	public int getNumero() {
		return numero;
	}
	
	
	
	//Getter Agencia
	public int getAgencia() {
		return agencia;
	}
	
	
	
	//Setter Titutal
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Getter Titular
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	

}
// Código sacado del curso Java OO, "Opinión del profesor"

/*public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Cuenta(int agencia, int numero){
        Cuenta.total++;
        System.out.println("Total de cuentas es " + Cuenta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estoy creando una cuenta" + this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("No pueder ser el valor menor o igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("No pueder ser el valor menor o igual a ");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Cuenta.total;
    }

}*/



