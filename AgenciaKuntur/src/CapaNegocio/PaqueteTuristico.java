
package CapaNegocio;

public class PaqueteTuristico {

    public PaqueteTuristico() {
        this.nroDias = 0;
        this.toursOfrecido = "";
        this.hotelOfrecido = "";
        this.transporteOfrecido = "";
    }

    public PaqueteTuristico(int nroDias, String toursOfrecido, String hotelOfrecido, String transporteOfrecido) {
        this.nroDias = nroDias;
        this.toursOfrecido = toursOfrecido;
        this.hotelOfrecido = hotelOfrecido;
        this.transporteOfrecido = transporteOfrecido;
    }
    
    
    public int nroDias;
    public String toursOfrecido;
    public String hotelOfrecido;
    public String transporteOfrecido;
    public Operador ofrecidoPorOperador;

    public int getNroDias() {
        return nroDias;
    }

    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }

    public String getToursOfrecido() {
        return toursOfrecido;
    }

    public void setToursOfrecido(String toursOfrecido) {
        this.toursOfrecido = toursOfrecido;
    }

    public String getHotelOfrecido() {
        return hotelOfrecido;
    }

    public void setHotelOfrecido(String hotelOfrecido) {
        this.hotelOfrecido = hotelOfrecido;
    }

    public String getTransporteOfrecido() {
        return transporteOfrecido;
    }

    public void setTransporteOfrecido(String transporteOfrecido) {
        this.transporteOfrecido = transporteOfrecido;
    }

public String Cambiar()
   {
       return "No se ha implementado el metodo";
   }

public String Informar()
   {
       return "No se ha implementado el metodo";
   }    
}
