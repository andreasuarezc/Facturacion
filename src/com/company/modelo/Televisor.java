package com.company.modelo;

public class Televisor extends Electrodomestico{
    private double tamaño;
    private boolean tdt;

    public Televisor(int codigo, String consumo, String procedencia, double tamaño, boolean tdt) {
        super(codigo, consumo, procedencia);
        this.tamaño = tamaño;
        this.tdt = tdt;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        if(tamaño > 40){
            super.precio = super.precio + (super.precio*0.3);
        }
        if (tdt==true){
            super.precio = super.precio+250000;
        }
    }
}
