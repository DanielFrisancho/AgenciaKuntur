
package CapaNegocio;

import java.util.ArrayList;

public class Proveedor {

    public Proveedor() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.servicio = "";
    }

    public Proveedor(String nombre, String apellido, String telefono, String servicio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.servicio = servicio;
    }
    
    
    public String nombre;
    public String apellido;
    public String telefono;
    public String servicio;
    public ArrayList<Operador> trabajaConOperador = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
public String ProveerServicio()
   {
       return "No se ha implementado el metodo";
   }

public String Cobrar()
   {
       return "No se ha implementado el metodo";
   }
   
    
}
