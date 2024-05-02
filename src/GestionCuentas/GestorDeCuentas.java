package GestionCuentas;
import java.util.HashMap;
import java.util.Scanner;

public class GestorDeCuentas extends CuentaBancaria{
	private HashMap<String, CuentaBancaria> gestorCuentas;



    public GestorDeCuentas() {
        //this.cuentas = new ArrayList<>();
    	this.gestorCuentas = new HashMap<>();
        
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
    	
        if (!gestorCuentas.containsKey(cuenta.getNumeroDeCuenta())) {
        	gestorCuentas.put(cuenta.getNumeroDeCuenta(), cuenta);
            System.out.println("Se realizo la creacion de la cuenta.");
        } else {
            System.out.println("El numero de cuenta ya existe.");
        }
    }

    public void realizarDeposito(String numeroDeCuenta, double deposito) {
    	if(gestorCuentas.containsKey(numeroDeCuenta)) {
    		gestorCuentas.get(numeroDeCuenta).depositar(deposito);
    	} else {
    		System.out.println("El numero de cuenta no existe.");
    	}
    }

    public void realizarRetiro(String numeroDeCuenta, double retiro) {
    	if(gestorCuentas.containsKey(numeroDeCuenta)) {
    		gestorCuentas.get(numeroDeCuenta).retirar(retiro);
    	} else {
    		System.out.println("El numero de cuenta no existe.");
    	}
    }

    public void consultarSaldo(String numeroDeCuenta) {
    	System.out.println("Consulta de Saldo de Cuenta");
    	if(gestorCuentas.containsKey(numeroDeCuenta)) {
    		System.out.println("El saldo de la cuenta con numero "+ numeroDeCuenta + " es de $" + gestorCuentas.get(numeroDeCuenta).consultarSaldo());
    	} else {
    		System.out.println("El numero de cuenta no existe.");
    	}
    }
    
    public boolean existeNumeroCuenta(String numeroDeCuenta) {
    	if(gestorCuentas.containsKey(numeroDeCuenta)) {
    		return(true);
    	} else {
    		return(false);
    	}
    }
    
    public void mostrarCuentas() {
        System.out.println("Listado de Cuentas");
        for (CuentaBancaria cuenta : gestorCuentas.values()) {
        	System.out.println(cuenta.getNumeroDeCuenta() + " - " + cuenta.getNombreDelCliente() + " - " + cuenta.getSaldo());
        }
    }
    
	public CuentaAhorro leerDatosCAhorro() {
		Scanner s = new Scanner(System.in);
		String numeroDeCuenta;
		
		CuentaAhorro nuevaCuenta = new CuentaAhorro();
		System.out.println("Adicionar Cuenta de Ahorro");
		
		do {
			   System.out.println("Ingrese el numero de cuenta: ");
			   numeroDeCuenta = s.nextLine();
			   if(gestorCuentas.containsKey(numeroDeCuenta)) {
				   System.out.println("El numero de Cuenta de Ahorro ya existe.");
				   System.out.println("Introduzca un nuevo numero de cuenta");
		    	}
			   
		} while((gestorCuentas.containsKey(numeroDeCuenta)));
		
		//System.out.println("Ingrese el numero de cuenta: ");
		//String numeroCuenta = s.nextLine();
		nuevaCuenta.setNumeroDeCuenta(numeroDeCuenta);
		
		System.out.println("Ingrese el nombre cliente: ");
		String nombreCliente = s.nextLine();
		nuevaCuenta.setNombreDelCliente(nombreCliente);
		
		System.out.println("Deposito Inicial: ");
		float deposito = Float.parseFloat(s.nextLine());
		nuevaCuenta.setSaldo(deposito);
		
		System.out.println("Tasa de Interes: ");
		float tasaInteres = Float.parseFloat(s.nextLine());
		nuevaCuenta.setTasaInteres(tasaInteres);
		return(nuevaCuenta);
	}
	
	public CuentaCorriente leerDatosCCorriente() {
		Scanner s = new Scanner(System.in);
		String numeroDeCuenta;
		
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		System.out.println("Adicionar Cuenta Corriente");
		
		//System.out.println("Ingrese el numero de cuenta: ");
		//String numeroCuenta = s.nextLine();
		do {
			   System.out.println("Ingrese el numero de cuenta: ");
			   numeroDeCuenta = s.nextLine();
			   if(gestorCuentas.containsKey(numeroDeCuenta)) {
				   System.out.println("El numero de Cuenta de Ahorro ya existe.");
				   System.out.println("Introduzca un nuevo numero de cuenta");
		    	}
			   
		} while((gestorCuentas.containsKey(numeroDeCuenta)));
		
		nuevaCuenta.setNumeroDeCuenta(numeroDeCuenta);
		
		System.out.println("Ingrese el nombre cliente: ");
		String nombreCliente = s.nextLine();
		nuevaCuenta.setNombreDelCliente(nombreCliente);
		
		System.out.println("Deposito Inicial: ");
		float deposito = Float.parseFloat(s.nextLine());
		nuevaCuenta.setSaldo(deposito);
		
		System.out.println("Limite de Sobregiro: ");
		float limiteSobregiro = Float.parseFloat(s.nextLine());
		nuevaCuenta.setLimiteSobregiro(limiteSobregiro);
		return(nuevaCuenta);
	}

}