package com.company.core.productos;

import com.company.core.Consumo;
import com.company.core.Procedencia;

public interface Producto {
    Integer codigo();

    Procedencia procedencia();

    Consumo consumo();
}
