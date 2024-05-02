package GestionCuentas;

import java.util.Scanner;


public class GestionCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		GestorDeCuentas gestor = new GestorDeCuentas();
		menuCuentas menu = new menuCuentas();
		String numeroDeCuenta;
		int opcion = 0, opciontipoCuenta = 0;
		
		do {
			opcion = menu.menuPrincipal();
			//opcion = Integer.parseInt(s.nextLine());
			switch(opcion) {
			case 1: 
					do {
						CuentaBancaria objCuentaBancaria = null;
						opciontipoCuenta = menu.menuTipoCuenta();
						//opciontipoCuenta = Integer.parseInt(s.nextLine());
						switch(opciontipoCuenta) {
							case 1: 
								objCuentaBancaria = new CuentaAhorro();
								objCuentaBancaria = gestor.leerDatosCAhorro();
								gestor.agregarCuenta(objCuentaBancaria);
								break;
							case 2: 
								objCuentaBancaria = new CuentaCorriente();
								objCuentaBancaria = gestor.leerDatosCCorriente();
								gestor.agregarCuenta(objCuentaBancaria);
							break;

							default: System.out.println("Ingrese una opcion valida");
							
						}
					} while((opciontipoCuenta != 3));
					break;
			case 2:
				
				do {
				   System.out.println("Ingrese el numero de cuenta: ");
				   numeroDeCuenta = s.nextLine();
				} while(!(gestor.existeNumeroCuenta(numeroDeCuenta)));

				
				System.out.println("Cantidad a Depositar: ");
				float deposito = Float.parseFloat(s.nextLine());
				gestor.realizarDeposito(numeroDeCuenta, deposito);
				break;
			case 3:
				
				do {
				   System.out.println("Ingrese el numero de cuenta: ");
				   numeroDeCuenta = s.nextLine();
				} while(!(gestor.existeNumeroCuenta(numeroDeCuenta)));

				
				System.out.println("Cantidad a Retirar: ");
				float retiro = Float.parseFloat(s.nextLine());
				gestor.realizarRetiro(numeroDeCuenta, retiro);
				
				//System.out.println("Mostrar cuentas");
				//gestor.mostrarCuentas();
				break;
			case 4:
				
				do {
				   System.out.println("Ingrese el numero de cuenta: ");
				   numeroDeCuenta = s.nextLine();
				} while(!(gestor.existeNumeroCuenta(numeroDeCuenta)));

				gestor.consultarSaldo(numeroDeCuenta);
				break;
			default: System.out.println("Ingrese una opcion valida");
					
			}
		} while((opcion != 5));
		
		System.out.println("Fin del Programa");
	}
}
