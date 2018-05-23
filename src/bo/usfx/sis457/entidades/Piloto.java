/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

/**
 *
 * @author Ines Gonzales
 */
public class Piloto extends Competidor{
    private String CertificadoAfiliacion;
    
     public Piloto(String Documento, String Nombres, String Apellidos, int NroLicencia, String CategoriaLicencia) {
        super(Documento, Nombres, Apellidos, NroLicencia, CategoriaLicencia);
    }
     public void Piloto(String CertificadoAfiliacion) {
    
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }
    public String getCertificadoAfiliacion() {
        return this.CertificadoAfiliacion;
    }

    public void setCertificadoAfiliacion(String CertificadoAfiliacion) {
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }
      @Override
    public void getTipoPersona() {
        System.out.println("Documento:"+this.Documento);
        System.out.println("Nombre:"+this.Nombres);
        System.out.append("Apellidos:"+this.Apellidos);      
        System.out.println("NroLicencia:"+this.NroLicencia);
        System.out.println("CategoriaLicencia:"+this.CategoriaLicencia);
        System.out.println("CertificadoAfiliacion:"+this.CertificadoAfiliacion);
    }   
}
