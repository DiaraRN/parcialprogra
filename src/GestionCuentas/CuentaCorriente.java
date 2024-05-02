package GestionCuentas;
public class CuentaCorriente extends CuentaBancaria{
	private double limiteSobregiro;
	/**
	 * 
	 */
	public CuentaCorriente() {
        super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param numeroDeCuenta
	 * @param numeroDeCliente
	 * @param saldo
	 */
	public CuentaCorriente(String numeroDeCuenta, String numeroDeCliente, double saldo, double limiteSobregiro) {
		super(numeroDeCuenta, numeroDeCliente, saldo);
		this.limiteSobregiro = limiteSobregiro;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean retirar(double retiro) {
        if ((this.saldo + this.limiteSobregiro) >= retiro) {
            this.saldo -= retiro;
            System.out.println("Se realizo el retiro. El nuevo saldo es: " + this.saldo);
            return true;
        } else {
            System.out.println("La cantidad a retirar es mayor al saldo que mantiene su cuenta");
            return false;
        }
	}

	/**
	 * @return the limiteSobregiro
	 */
	public double getLimiteSobregiro() {
		return limiteSobregiro;
	}

	/**
	 * @param limiteSobregiro the limiteSobregiro to set
	 */
	public void setLimiteSobregiro(double limiteSobregiro) {
		this.limiteSobregiro = limiteSobregiro;
	}

}
