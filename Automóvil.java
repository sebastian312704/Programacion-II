

public class Automóvil {
    
    String marca;
    int modelo;
    double motor;
    enum Tipotransmision {automatica, manual};
    Tipotransmision transmision;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,EJECUTIVO, SUV}
    tipoA tipoAutomóvil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;
    int multas = 0;
    int velocidadMaxima;
    

    public Automóvil(String marca, int modelo, double motor, Automóvil.Tipotransmision transmision, Automóvil.tipoCom tipoCombustible,
        Automóvil.tipoA tipoAutomóvil, int numeroPuertas, int cantidadAsientos, int velocidadMáxima,
        Automóvil.tipoColor color, int velocidadActual) {

    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.transmision = transmision;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomóvil = tipoAutomóvil;
    this.numeroPuertas = numeroPuertas;
    this.cantidadAsientos = cantidadAsientos;
    this.velocidadMáxima = velocidadMáxima;
    this.color = color;
    this.velocidadActual = velocidadActual;
    this.multas = 0;
    this.velocidadMaxima = velocidadMáxima;
}

    public Automóvil(String marca, int i, double d, Automóvil.Tipotransmision automatica,
            Automóvil.tipoCom bioetanol, Automóvil.tipoA ciudad, int j, int k, int l, Automóvil.tipoColor negro) {
    }

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }


    public int getModelo() {
        return modelo;
    }


    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    public double getMotor() {
        return motor;
    }


    public void setMotor(int motor) {
        this.motor = motor;
    }


    public Automóvil.Tipotransmision getTransmision() {
        return transmision;
    }


    public void setTransmision(Automóvil.Tipotransmision transmision) {
        this.transmision = transmision;
    }


    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    public tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }


    public void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }


    public int getNúmeroPuertas() {
        return numeroPuertas;
    }


    public void setNúmeroPuertas(int númeroPuertas) {
        this.numeroPuertas = númeroPuertas;
    }


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }


    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }


    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }


    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }


    public tipoColor getColor() {
        return color;
    }


    public void setColor(tipoColor color) {
        this.color = color;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }

    void setVelocidadActual(int nuevaVelocidad) {
        if (nuevaVelocidad >= 0 && nuevaVelocidad <= velocidadMaxima) {
            velocidadActual = nuevaVelocidad;
        } else if (nuevaVelocidad > velocidadMaxima) {
            generarMulta();
            System.out.println("Se ha generado una multa por exceso de velocidad.");
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

    boolean tieneMultas() {
        return multas > 0;
    }

    int valorTotalMultas() {
        return multas * 50; // Valor arbitrario de multa
    }

    private void generarMulta() {
        multas++;
    }

    
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
        velocidadActual = velocidadActual + incrementoVelocidad;
    } else { 
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            generarMulta();
            System.out.println("Se ha generado una multa por exceso de velocidad.");
        }
    }

    void desacelerar(int decrementoVelocidad) {
    if ((velocidadActual - decrementoVelocidad) > 0) {
        velocidadActual = velocidadActual - decrementoVelocidad;
    } else { 
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    void frenar() {
        velocidadActual = 0;
    }
    
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo transmision = " + transmision);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
    }

    public static void main(String args[]) {
        
    Automóvil auto = new Automóvil("Ford", 2022, 6.5, Tipotransmision.automatica,
    tipoCom.BIOETANOL, tipoA.CIUDAD, 2, 2, 100, tipoColor.BLANCO, 150);

    auto.imprimir();

    auto.setVelocidadActual(120);
    System.out.println(" La velocidad actual es " + auto.velocidadActual);

    auto.acelerar(40);
    System.out.println(" La velocidad actual es " + auto.velocidadActual);

    auto.desacelerar(60);
    System.out.println(" La velocidad actual es " + auto.velocidadActual);

    auto.frenar();

    System.out.println("Tiene multas: " + auto.tieneMultas());
    System.out.println("Valor total de multas: $" + auto.valorTotalMultas());


    }
}
