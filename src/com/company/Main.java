package com.company;

import com.company.core.*;
import com.company.core.productos.Nevera;
import com.company.core.productos.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Nevera(
                100001, Consumo.A, Procedencia.NACIONAL, 10
        ));
        electrodomesticos.add(new Nevera(
                100002, Consumo.B, Procedencia.NACIONAL, 10
        ));
        electrodomesticos.add(new Televisor(
                100003, Consumo.C, Procedencia.INTERNACIONAL, 3D, true
        ));
        for(Electrodomestico electrodomestico :  electrodomesticos){
            electrodomestico.definirPrecio();
            System.out.println(electrodomestico);
        }

    }
}
