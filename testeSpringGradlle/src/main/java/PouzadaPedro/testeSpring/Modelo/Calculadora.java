package PouzadaPedro.testeSpring.Modelo;

/**
 * @author Pedro
 * @version 1.0
 * @since 09/06/2020 - 11:42
 * @Category Model
 */
public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {

    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double somar() {
        return this.numero1 + this.numero2;
    }

    @Override
    public String toString() {
        return "Numero1: " + numero1
                +"\nNumero2: " + numero2
                +"\nSoma: " + somar();
    }
}
