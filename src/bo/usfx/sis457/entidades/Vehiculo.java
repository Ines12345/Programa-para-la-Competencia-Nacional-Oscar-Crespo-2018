/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;
import bo.usfx.sis457.interfaces.CaracteristicasCompetencia;
import bo.usfx.sis457.interfaces.CaracteristicasOcupante;

/**
 *
 * @author Ines Gonzales
 */
public class Vehiculo implements CaracteristicasCompetencia ,CaracteristicasOcupante{
    private int Numero;
    private String Marca;
    private String Modelo;
    private String Cilindrada;
    private float DistanciaRecorrida;
    private float TiempoEnCompetencia;
    private double Latitud;
    private double Longitud;
    private String PilotoABordo;
    private String NaveganteABordo;
    private String piloto;
    

public void VelocidadPromedio(){
}
public void GeoPosicion(){
}
public void Piloto(){
}
public void Navegante(){
}
    public Vehiculo(int Numero, String Modelo, float DistanciaRecorrida,float TiempoEnCompetencia, double Latitud, double Longitud, String PilotoABordo, String NaveganteABordo) {
        this.Numero = Numero;
        this.Modelo = Modelo;
        this.DistanciaRecorrida = DistanciaRecorrida;
        this.TiempoEnCompetencia = TiempoEnCompetencia;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.PilotoABordo = PilotoABordo;
        this.NaveganteABordo = NaveganteABordo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public float getDistanciaRecorrida() {
        return DistanciaRecorrida;
    }

    public void setDistanciaRecorrida(float DistanciaRecorrida) {
        this.DistanciaRecorrida = DistanciaRecorrida;
    }
       public float getTiempoEnCompetencia() {
        return TiempoEnCompetencia;
    }

    public void setiempoEnCompetencia(float TiempoEnCompetencia) {
        this.TiempoEnCompetencia = TiempoEnCompetencia;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public String getPilotoABordo() {
        return PilotoABordo;
    }

    public void setPilotoABordo(String PilotoABordo) {
        this.PilotoABordo = PilotoABordo;
    }

    public String getNaveganteABordo() {
        return NaveganteABordo;
    }

    public void setNaveganteABordo(String NaveganteABordo) {
        this.NaveganteABordo = NaveganteABordo;
    }
    

    @Override
    public void getVelocidadPromedio() {
       float V = this.DistanciaRecorrida/this.TiempoEnCompetencia;
     }

    public String getGeoPosicion() {
       double Lat = this.Latitud;
       double lon = this.Longitud;
       return "-"+Lat+"-"+lon;
    }

    @Override
    public void  getPiloto() {
     System.out.println("Javier Rojas Gomes");
    }

    @Override
    public void getNavegante() {
        System.out.println("David Carbajal Rodriguez");
    }
}
