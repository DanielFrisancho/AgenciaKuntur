
package CapaNegocio;

import java.util.ArrayList;

public class Operador {

    public Operador() {
        this.nombre = "";
        this.apellido = "";
        this.dNI = "";
        this.telefono = "";
        this.correo = "";
    }

    public Operador(String nombre, String apellido, String dNI, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dNI = dNI;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
    public String nombre;
    public String apellido;
    public String dNI;
    public String telefono;
    public String correo;
    public ArrayList<Proveedor> trabajaConProveedor = new ArrayList();
    public ArrayList<Cliente> atiendeCliente = new ArrayList();
    public ArrayList<Registro> generaRegistro = new ArrayList();
    public ArrayList<PaqueteTuristico> ofrecePaqueteTuristico = new ArrayList();
    public ArrayList<Trabajador> trabajaConTrabajador = new ArrayList();

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

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

public String Gestionar()
   {
       return "No se ha implementado el metodo";
   }

public String Recepcionar()
   {
       return "No se ha implementado el metodo";
   }
}
