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
public class Organizador extends Participante{
    private String Cargo;
    private String Comision;
    
    public Organizador(String Documento, String Nombres, String Apellidos,String Cargo, String Comision) {
        this.Documento=Documento;
        this.Nombres=Nombres;
        this.Apellidos=Nombres;
        this.Cargo = Cargo;
        this.Comision = Comision;
    }

    public Organizador(String string, int i, String computacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }
        @Override
    public void getTipoPersona() {
        System.out.println("Es Organizador");
    }   

}
