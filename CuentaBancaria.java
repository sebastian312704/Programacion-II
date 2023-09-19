
public class CuentaBancaria {
    
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    float Apliinteres;

    CuentaBancaria(String nombresTitular, String apellidosTitular, int
    numeroCuenta, tipo tipoCuenta) {
        /* Tener en cuenta que no se pasa como parámetro el saldo ya
        que inicialmente es cero. */
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.Apliinteres = 0;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }
    
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }
    
    boolean consignar(int valor) {
    // El valor a consignar debe ser mayor que cero
    if (valor > 0) {
        saldo = saldo + valor; /* Se actualiza el saldo de la cuenta con
        el valor consignado */
        System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
        return true;
    } else {
        System.out.println("El valor a consignar debe ser mayor que cero.");
        return false;
        }
    }
    
    boolean retirar(int valor) {
    
    if ((valor > 0) && (valor <= saldo)) {
        saldo = saldo - valor; /* Se actualiza el saldo de la cuenta con
        el valor retirado */
        System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
        return true;
    } else {
        System.out.println("El valor a retirar debe ser menor que el saldo actual.");
        return false;
        }
    }

        void aplicarInteres() {
            float interes = saldo * (Apliinteres / 100);
            saldo += interes;
            System.out.println("Se ha aplicado interés. El nuevo saldo es $" + saldo);
        }

    public static void main(String args[]) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez", 123456789,tipo.AHORROS);
        cuenta.imprimir();
        cuenta.Apliinteres = 8.8f;

        cuenta.consignar(200000);
        cuenta.aplicarInteres();
        cuenta.consignar(300000);
        cuenta.aplicarInteres();
        cuenta.retirar(400000);
        cuenta.consultarSaldo();
        
    }
}
