/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ines Gonzales
 */
public class CircuitoOscarCrespo {
     public static ArrayList<Participante> participantes;
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
       participantes = new ArrayList<>();    
        menuPrincipal();
    }
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+=================================================+");
        System.out.println("| Programa: Circuito Oscar Crespo                  |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Participantes                       |");
        System.out.println("| 2) Gestión de Competidor                         |");
        System.out.println("| 3) Gestión de Organizador                        |");
        System.out.println("| 4) Gestión de Vehiculos                           |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuParticipantes();
                break;
            case "2":
                menuCompetidor();
                break;
            case "3":
                menuOrganizador();
                break;
            case "4":
                menuVehiculo();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
        public static void menuParticipantes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Participantes                          |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Obtener listado                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                ObenerLitado();
                volverMenu();
                menuParticipantes();
                break;
            default:
                menuPrincipal();
        }
    }
        
    public static void menuCompetidor() {
         // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Competidores                          |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Competidor Navegante                          |");
        System.out.println("| 2) Competidor Piloto                             |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuNavegante();
                volverMenu();
                menuCompetidor();
                break;
            case "2":
                menuPiloto();
                volverMenu();
                menuCompetidor();
                break;
            default:
                menuPrincipal();
        }
    }  
    
    
        public static void menuOrganizador() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Organizador                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Obtener listado                                |");
        System.out.println("| 2) Crear Organizador                             |");
        System.out.println("| 3) Modificar Organizador                         |");
        System.out.println("| 4) Eliminar Organizador                          |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                obtenerListado();
                volverMenu();
                menuOrganizador();
                break;
            case "2":
                crearOrganizador();
                volverMenu();
                menuOrganizador();
                break;
            case "3":
                modificarOrganizador();
                volverMenu();
                menuOrganizador();
                break;
            case "4":
                eliminarOrganizador();
                volverMenu();
                menuOrganizador();
                break;
            default:
                menuPrincipal();
        }
    }
    
       public static void   menuVehiculo() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Vehiculos                         |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Obtener Listado                               |");
        System.out.println("| 2) Crear Vehiculo                                |");
        System.out.println("| 3) Modificar Vehiculo                   |");
        System.out.println("| 4) Eliminar Vehiculo                         |");
        System.out.println("| 5) Obtener Velocidad Promedio                        |");
        System.out.println("| 6) Obtener GeoPosición                        |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                Vehiculo();
                volverMenu();
                menuVehiculo();
                break;
            case "2":
                CrearVehiculo();
                volverMenu();
                menuVehiculo();
                break;
            case "3":
                modificarVehiculo();
                volverMenu();
                menuVehiculo();
                break;
            case "4":
                eliminarVehiculo();
                volverMenu();
                menuVehiculo();
                break;
            case "4":
                obtener VelocidadPromedio();
                volverMenu();
                menuVehiculo();
                break;
            case "4":
                obtener GeoPosición();
                volverMenu();
                menuVehiculo();
                break;
            default:
                menuPrincipal();
        }
    }
        
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
       public static void menuNavegante() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Competidor Navegante                  |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Obetener Listado competidor Navegante          |");
        System.out.println("| 2) Crear competidor Navegante                    |");
        System.out.println("| 3) Modificar competidor Navegante                |");
        System.out.println("| 4) Elimimar competidor Navegante                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                ListarNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "2":
                crearNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "3":
                modificarNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "4":
                eliminarNavegante();
                volverMenu();
                menuNavegante();
                break;
            default:
                menuPrincipal();
        }
    }
     
     public static void menuPiloto() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Piloto                                |");
        System.out.println("+==================================================+");
        System.out.println("| 1) obtener Listado Competidor Piloto                      |");
        System.out.println("| 2) Crear Competidor Piloto                       |");
        System.out.println("| 3) Modificar Competidor Piloto                   |");
        System.out.println("| 4) Eliminar Competidor Piloto                    |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "2":
                crearPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "3":
                modificarPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "4":
                eliminarPiloto();
                volverMenu();
                menuPiloto();
                break;
            default:
                menuPrincipal();
        }
    }
     
           public static void ObenerLitado() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Parcipantes                            |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante participante: participantes) {
            i++;
            System.out.println(i + ": " + participante);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarParticipantes(int id) {
        boolean existe = false;
        int i = 0;
        for (Participante participante: participantes) {
            if (id != participantes.getId()) {
            } else {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
     public static void  obtenerListado() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Organizadores                           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante organizador: participantes) {
            if (organizador instanceof Organizador) {
                i++;
                System.out.println(i + ": " + organizador);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void crearOrganizador() {
       String Documento;
       String Nombres;
       String Apellidos;
       String Cargo;
       String Comision;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Organizadores                               |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            Documento = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            Nombres = entradaTeclado.readLine();
            System.out.print("Introduzca los Apellidos: ");
            Apellidos =entradaTeclado.readLine();
            System.out.print("Introduzca los Cargos: ");
            Cargo = entradaTeclado.readLine();
            System.out.print("Introduzca la Comision: ");
            Comision = entradaTeclado.readLine();
            participantes.add(new Organizador( Comision, Nombres, Apellidos, Cargo, Comision));
            System.out.println("Registro de Organizadores completado!");
            }  catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void  modificarOrganizador(){
        int id;
        Organizador organizador;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Organizadores                          |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Organizadores a Modificar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                organizador = (Organizador)participantes.get(id);
                System.out.print("Modificar el Carnet de Documento '" +  organizador.getDocumento()+ "': ");
                 organizador.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar el Nombres '" +  organizador .getNombres() + "': ");
                 organizador.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + organizador .getApellidos() + "': ");
                organizador .setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar el Cargo'"+  organizador.getCargo()+ "': ") ;
                organizador.setCargo (entradaTeclado.readLine());
                System.out.print("Modificar el Lugar de su trabajo' " +organizador.getComision()+ "': ");
                 organizador .setComision(entradaTeclado.readLine());
                System.out.println("Registro de Organizador modificado!");
            } else {
                System.out.println("El Registro de Organizador no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void eliminarOrganizador() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Eliminar Organizadores                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Organizadoes a Eliminar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Organizadores eliminado!");
            } else {
                System.out.println("El Registro de Organizadores no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     *
     */
    public static void listarNavegante(){
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Competidor Navegante                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante navegante: participantes) {
            if (navegante instanceof Navegante) {
                i++;
                System.out.println(i + ": " + navegante);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
     
     public static void crearNavegante() {
       String Documento;
       String Nombres;
       String Apellidos;
       int NroLicencia;
       String CategoriaLicencia;
       String CertificadoMecanica;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Crear Competidores Navegante                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            Documento = entradaTeclado.readLine();
            System.out.print("Introduzca Nombres: ");
            Nombres = entradaTeclado.readLine();
            System.out.print("Introduzca Apellidos: ");
            Apellidos = entradaTeclado.readLine();
            System.out.print("Introduzca Nro de Licencia: ");
            NroLicencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Categoria de Licencia: ");
            CategoriaLicencia = entradaTeclado.readLine();
            System.out.print("Introduzca Certicado Macanica ");
            CertificadoMecanica = entradaTeclado.readLine();
            System.out.println("Registro de Competidores Navegante completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
     public static void modificarNavegante() {
        int id;
        Navegante navegante;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Competidores Navegante                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id de los Competidores Navegante a Modificar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                navegante= (Navegante)participantes.get(id);
                System.out.print("Modificar el Documento '" +navegante.getDocumento()+ "': ");
                navegante.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar Nombres '" + navegante.getNombres()+ "': ");
                navegante.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + navegante.getApellidos()+ "': ");
                navegante.setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + navegante.getNroLicencia()+ "': ");
                navegante.setNroLicencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar Categoria de Licencia '" + navegante.getCategoriaLicencia() + "': ");
                navegante.setCategoriaLicencia(entradaTeclado.readLine());
                System.out.print("Modificar Certificado de Mecanico  '" + navegante.getCertificadoMecanica() + "': ");
                navegante.setCertificadoMecanica(entradaTeclado.readLine());
                System.out.println("Registro de Competodores Navegante modificado!");
            } else {
                System.out.println("El Registro de Competidores no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void eliminarNavegante() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Eliminar Competidor Navegante                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Competidor  Navegante a Eliminar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Competidor Navegante Eliminado!");
            } else {
                System.out.println("El Registro de Competidor Navegante no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
      public static void listarPiloto() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Competidor Piloto                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante navegante: participantes) {
            if (navegante instanceof Navegante) {
                i++;
                System.out.println(i + ": " + navegante);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
     
     public static void crearPiloto() {
       String Documento;
       String Nombres;
       String Apellidos;
       int NroLicencia;
       String CategoriaLicencia;
       String CertificadoAfiliacion;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Crear Competidores Piloto                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            Documento = entradaTeclado.readLine();
            System.out.print("Introduzca Nombres: ");
            Nombres = entradaTeclado.readLine();
            System.out.print("Introduzca Apellidos: ");
            Apellidos = entradaTeclado.readLine();
            System.out.print("Introduzca Nro de Licencia: ");
            NroLicencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Categoria de Licencia: ");
            CategoriaLicencia = entradaTeclado.readLine();
            System.out.print("Introduzca Certificado de Afiliacion ");
            CertificadoAfiliacion = entradaTeclado.readLine();
            System.out.println("Registro de Competidores Piloto completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
     public static void modificarPiloto() {
        int id;
        Piloto piloto;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Competidores Piloto                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id de los Competidores Piloto a Modificar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                piloto= (Piloto)participantes.get(id);
                System.out.print("Modificar el Documento '" +piloto.getDocumento()+ "': ");
                piloto.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar Nombres '" + piloto.getNombres()+ "': ");
                piloto.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + piloto.getApellidos()+ "': ");
                piloto.setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + piloto.getNroLicencia()+ "': ");
                piloto.setNroLicencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar Categoria de Licencia '" + piloto.getCategoriaLicencia() + "': ");
                piloto.setCategoriaLicencia(entradaTeclado.readLine());
                System.out.print("Modificar Certificado de Mecanico  '" + piloto.getCertificadoAfiliacion() + "': ");
                piloto.setCertificadoAfiliacion(entradaTeclado.readLine());
                System.out.println("Registro de Competodores Piloto modificado!");
            } else {
                System.out.println("El Registro de Competidores Piloto no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void eliminarPiloto() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Eliminar Competidor Piloto                       |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Competidores Piloto a Eliminar: ");
            id = buscarParticipantes(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Competidor Piloto Eliminado!");
            } else {
                System.out.println("El Registro de Competidor Piloto no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
