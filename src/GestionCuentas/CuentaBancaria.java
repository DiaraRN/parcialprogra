package GestionCuentas;

public class CuentaBancaria {
	private String numeroDeCuenta;
	private String nombreDelCliente;
	protected double saldo;
	
	/**
	 * 
	 */
	public CuentaBancaria() {
		
	}
	/**
	 * @param numeroDeCuenta
	 * @param numeroDeCliente
	 * @param saldo
	 */
	public CuentaBancaria(String numeroDeCuenta, String numeroDeCliente, double saldo) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.nombreDelCliente = numeroDeCliente;
		this.saldo = saldo;
	}

	/**
	 * @return the numeroDeCuenta
	 */
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	/**
	 * @param numeroDeCuenta the numeroDeCuenta to set
	 */
	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	/**
	 * @return the numeroDeCliente
	 */
	public String getNombreDelCliente() {
		return nombreDelCliente;
	}
	/**
	 * @param numeroDeCliente the numeroDeCliente to set
	 */
	public void setNombreDelCliente(String numeroDeCliente) {
		this.nombreDelCliente = numeroDeCliente;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Se realizo el deposito. El nuevo saldo es: " + this.saldo);
	}
	
	public boolean retirar(double retiro) {
        if (this.saldo >= retiro) {
            this.saldo -= retiro;
            System.out.println("Se realizo el retiro. El nuevo saldo es: " + this.saldo);
            return true;
        } else {
            System.out.println("La cantidad a retirar es mayor al saldo que mantiene su cuenta");
            return false;
        }
	}
	
    public double consultarSaldo() {
        return this.getSaldo();
    }
}
