
package CapaNegocio;

public class Trabajador {

    public Trabajador() {
        this.nombres = "";
        this.apellidos = "";
        this.dNI = "";
        this.telefono = "";
        this.idiomas = "";
        this.profesion = "";
    }

    public Trabajador(String nombres, String apellidos, String dNI, String telefono, String idiomas, String profesion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dNI = dNI;
        this.telefono = telefono;
        this.idiomas = idiomas;
        this.profesion = profesion;
    }
    
    
    public String nombres;
    public String apellidos;
    public String dNI;
    public String telefono;
    public String idiomas;
    public String profesion;
    public Operador trabajaConOperador;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

public String Transportar()
   {
       return "No se ha implementado el metodo";
   }

public String Guiar()
   {
       return "No se ha implementado el metodo";
   }
public String Administrar()
   {
       return "No se ha implementado el metodo";
   }
}
