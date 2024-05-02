package GestionCuentas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class menuCuentas {
	public Integer menuPrincipal() {
		int opcion = 0;
		boolean waitingForAnswer = true;
	    while(waitingForAnswer) {
	        try
	        {
	            BufferedReader menuInput = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("    BANCOP DIYEI    ");
	            System.out.println();
	            System.out.println("   MENU PRINCIPAL   ");
	    		System.out.println(" (1) Adicionar Nueva Cuenta");
	    		System.out.println(" (2) Realizar Deposito");
	    		System.out.println(" (3) Realizar Retiro");
	    		System.out.println(" (4) Consultar saldo");
	    		System.out.println(" (5) Salir");
	    		System.out.print(" Ingrese la opción deseada: ");
	            opcion = Integer.parseInt(menuInput.readLine());
	            waitingForAnswer = false;
	        } catch (NumberFormatException ex) {
	            System.err.println("No es una opcion valida");
	            waitingForAnswer = true;
	        } catch (IOException e) {
	            System.out.println("No se ha podido obtener una opcion valida");
	            waitingForAnswer = true;
	        }
	    }
		
		return(opcion);
	}
	
	//public cuentaBancaria leerDato
	
	public Integer menuTipoCuenta() {
		int opcion = 0;
		boolean waitingForAnswer = true;
	    while(waitingForAnswer) {
	        try
	        {
	            BufferedReader menuInput = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("    BANCOP DIYEI    ");
	            System.out.println("  Tipo de Cuenta");
	            System.out.println(" (1) Cuenta de Ahorro");
	            System.out.println(" (2) Cuenta Corriente");
	            System.out.println(" (3) Salir");
	            System.out.print(" Ingrese la opción deseada: ");
	            opcion = Integer.parseInt(menuInput.readLine());
	            waitingForAnswer = false;
	        } catch (NumberFormatException ex) {
	            System.err.println("No es una opcion valida");
	            waitingForAnswer = true;
	        } catch (IOException e) {
	            System.out.println("No se ha podido obtener una opcion valida");
	            waitingForAnswer = true;
	        }
	    }
		
		return(opcion);
		
	}
	

	/*public CuentaCorriente leerDatosDeposito() {
		Scanner s = new Scanner(System.in);
		
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		System.out.println("Realizar Deposito");
		
		System.out.println("Ingrese el numero de cuenta: ");
		String numeroCuenta = s.nextLine();
		nuevaCuenta.setNumeroDeCuenta(numeroCuenta);
		
		System.out.println("Cantidad a Depositar: ");
		float deposito = Float.parseFloat(s.nextLine());
		nuevaCuenta.setSaldo(deposito);
		
	}*/
}
