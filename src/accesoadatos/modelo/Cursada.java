/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos.modelo;

/**
 *
 * @author programador
 */
public class Cursada {
   Alumno alumno;
   Materia materia;
   private int nota;
   private int idCursada;

    public Cursada(Alumno alumno, Materia materia, int nota, int idCursada) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.idCursada = idCursada;
    }
    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getNota() {
        return nota;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }
   
   
}
