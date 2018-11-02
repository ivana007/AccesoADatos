
package accesoadatos;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;
import java.time.LocalDate;
import java.time.Month;


public class AccesoADatos {

    //aca arranca la aplicacion
    public static void main(String[] args) {
        
     Conexion con = new Conexion();
     AlumnoData ad= new AlumnoData(con);
     
     Alumno alumno1 = new Alumno("Lopez Karina", LocalDate.of(1976,01, 20),true);
     
     ad.guardarAlumno(alumno1);
     for(Alumno it:ad.listarAlumnos()){
      System.out.println("ID: " + it.getId());
      System.out.println("Nombre: " + it.getNombre());
     }
     
     //System.out.println("Nuevo Alumno id: " + alumno1.getId());
     // voy a borrar un alumno;
     ad.borrarAlumno(alumno1.getId());
     for(Alumno it:ad.listarAlumnos()){
      System.out.println("ID: " + it.getId());
      System.out.println("Nombre: " + it.getNombre());
     }
    }
    
}