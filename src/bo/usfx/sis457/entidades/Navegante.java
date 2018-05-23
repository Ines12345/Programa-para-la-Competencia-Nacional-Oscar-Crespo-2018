/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author Ines Gonzales
 */
public class Navegante extends Competidor {
    private String CertificadoMecanica;

    public Navegante(String Documento, String Nombres, String Apellidos, int NroLicencia, String CategoriaLicencia) {
        super(Documento, Nombres, Apellidos, NroLicencia, CategoriaLicencia);
    }

    public void  Navegante(String CertificadoMecanica) {
       
        this.CertificadoMecanica = CertificadoMecanica;
    }

    public String getCertificadoMecanica() {
        return CertificadoMecanica;
    }

    public void setCertificadoMecanica(String CertificadoMecanica) {
        this.CertificadoMecanica = CertificadoMecanica;
    }
      @Override
    public void getTipoPersona() {
        System.out.println("Documento:"+this.Documento);
        System.out.println("Nombre:"+this.Nombres);
        System.out.append("Apellidos:"+this.Apellidos);      
        System.out.println("NroLicencia:"+this.NroLicencia);
        System.out.println("CategoriaLicencia:"+this.CategoriaLicencia);
        System.out.println("CertificadoMecanico:"+this.CertificadoMecanica);
    }
    
}
