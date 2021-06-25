
package CapaNegocio;

public class Registro {

    public Registro() {
        this.nroRegistro = "";
        this.nombrePax = "";
        this.telefonoPax = "";
        this.nacionalidad = "";
    }

    public Registro(String nroRegistro, String nombrePax, String telefonoPax, String nacionalidad) {
        this.nroRegistro = nroRegistro;
        this.nombrePax = nombrePax;
        this.telefonoPax = telefonoPax;
        this.nacionalidad = nacionalidad;
    }
    
    
    public String nroRegistro;
    public String nombrePax;
    public String telefonoPax;
    public String nacionalidad;
    public Operador generadoPorOperador;

    public String getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(String nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getNombrePax() {
        return nombrePax;
    }

    public void setNombrePax(String nombrePax) {
        this.nombrePax = nombrePax;
    }

    public String getTelefonoPax() {
        return telefonoPax;
    }

    public void setTelefonoPax(String telefonoPax) {
        this.telefonoPax = telefonoPax;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

public String RecepcionarDatos()
   {
       return "No se ha implementado el metodo";
   }
  
}
