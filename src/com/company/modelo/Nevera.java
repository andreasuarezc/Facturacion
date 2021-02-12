package com.company.modelo;

public class Nevera extends Electrodomestico{
    private int capacidad;

    public Nevera(int codigo, String consumo, String procedencia, int capacidad) {
        super(codigo, consumo, procedencia);
        this.capacidad = capacidad;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        if (capacidad > 120){
            int litrosAdicionales = capacidad-120;
            float fraccion = litrosAdicionales/10;
            double incremento = fraccion*0.05;
            super.precio = super.precio + super.precio*incremento;
        }
    }
}
