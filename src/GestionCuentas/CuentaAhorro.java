package GestionCuentas;
public class CuentaAhorro extends CuentaBancaria {
	//private double saldo;
	private double tasaInteres;
	
	public CuentaAhorro() {
		super();
	}
	/**
	 * @param numeroDeCuenta
	 * @param numeroDeCliente
	 * @param saldo
	 */
	public CuentaAhorro(String numeroDeCuenta, String numeroDeCliente, double saldo, double tasaInteres) {
		super(numeroDeCuenta, numeroDeCliente, saldo);
		this.tasaInteres = tasaInteres;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the tasaInteres
	 */
	public double getTasaInteres() {
		return tasaInteres;
	}
	/**
	 * @param tasaInteres the tasaInteres to set
	 */
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	

}
