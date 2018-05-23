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
public class Competidor extends Participante{
    protected int NroLicencia;
    protected String CategoriaLicencia;

    public Competidor( String Documento, String Nombres, String Apellidos,int NroLicencia, String CategoriaLicencia) { 
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos=Apellidos;
        this.NroLicencia = NroLicencia;
        this.CategoriaLicencia = CategoriaLicencia;
    }

    public int getNroLicencia() {
        return this.NroLicencia;
    }

    public void setNroLicencia(int NroLicencia) {
        this.NroLicencia = NroLicencia;
    }

    public String getCategoriaLicencia() {
        return this.CategoriaLicencia;
    }

    public void setCategoriaLicencia(String CategoriaLicencia) {
        this.CategoriaLicencia = CategoriaLicencia;
    }

    public void getTipoPersona() {
        System.out.println("Es Competidor");   
    }
}
