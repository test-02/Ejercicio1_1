package com.example.ejercicio1_1.Operaciones;

public class Transacciones {

    private Double numero1 = null;
    private Double numero2 = null;
    private Double suma, resta, division, multiplicacion = null;

    public Transacciones() {
        //Todo
    }

    public void setDatos(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    private double suma() {
        suma = numero1 + numero2;
        return suma;
    }

    public double getSuma() {
        return suma();
    }

    private double resta() {
        resta = numero1 - numero2;
        return resta;
    }

    public double getresta() {
        return resta();
    }

    private double division() {
        division = numero1 / numero2;
        return division;
    }

    public double getdivision() {
        return division();
    }

    private double multiplicacion() {
        suma = numero1 * numero2;
        return multiplicacion;
    }

    public double getmultiplicacion() {
        return multiplicacion();
    }
}
