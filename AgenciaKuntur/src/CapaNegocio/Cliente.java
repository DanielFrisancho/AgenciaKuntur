
package CapaNegocio;

public class Cliente {
    
    public Cliente() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.pais = "";
        this.estadia = "";
    }

    public Cliente(String nombre, String apellido, String telefono, String pais, String estadia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.pais = pais;
        this.estadia = estadia;
    }
    
    public String nombre;
    public String apellido;
    public String telefono;
    public String pais;
    public String estadia;
    public Operador AtendidoPorOperador;


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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }
    
public String Pagar()
   {
       return "No se ha implementado el metodo";
   }

public String Visitar()
   {
       return "No se ha implementado el metodo";
   }
    
}
