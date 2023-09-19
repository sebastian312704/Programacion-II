import java.lang.Math;

class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}

public class figuras {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        System.out.println("Círculo - Area: " + circulo.calcularArea() + " Perímetro: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Rectángulo - Area: " + rectangulo.calcularArea() + " Perímetro: " + rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado(3);
        System.out.println("Cuadrado - Area: " + cuadrado.calcularArea() + " Perímetro: " + cuadrado.calcularPerimetro());

        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);
        System.out.println("Triángulo Rectángulo - Area: " + triangulo.calcularArea() + " Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());

        Rombo rombo1 = new Rombo(8, 6, 5);
        System.out.println("Area del rombo: " + rombo1.calcularArea());
        System.out.println("Perímetro del rombo: " + rombo1.calcularPerimetro());

        Trapecio trapecio1 = new Trapecio(10, 6, 8, 8, 4);
        System.out.println("Area del trapecio: " + trapecio1.calcularArea());
        System.out.println("Perímetro del trapecio: " + trapecio1.calcularPerimetro());
    }
}
