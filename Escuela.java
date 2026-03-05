public class Escuela{
    private Alumno alumno;

    //Constructor
    public Escuela(Alumno alumno){
        this.alumno = alumno;

    }

    public void mostrarAlumno(){
        alumno.mostrarAlumno();
    }
}