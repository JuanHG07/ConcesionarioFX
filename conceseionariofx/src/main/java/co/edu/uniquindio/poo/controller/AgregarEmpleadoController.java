package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vendedor;

public class AgregarEmpleadoController {
    
    Concesionario concesionario;

    public AgregarEmpleadoController(Concesionario concesionario){
        this.concesionario=concesionario;
    }

    public void agregarVendedor(Vendedor Vendedor){
        concesionario.agregarVendedor(Vendedor);
    }
    
    public Vendedor recuperarVendedor(String codigo){
        return concesionario.verificarVendedor(codigo);
    }

}
