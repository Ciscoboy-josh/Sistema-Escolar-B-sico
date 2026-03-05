public class Main{
    public static void main(String[]args){

        Alumno  = new Alumno();
        String nombre = pd.pedircadna("Nombre del alumno");
        int matricula = pd.pedircadna("Matricula");
        double calificacion1= pd.pedircadna("Calificacion 1",0,10);
        double calificacion2 = pd.pedircadna("Calificacion 2",0,10);
        double calificacion3 = pd.pedircadna("Calificacion 3",0,10);
        double promedio = pd.pedircadna("Promedio final");

        Alumno a= new Alumno (nombre,matricula,calificacion1,calificacion2,calificacion3,promedio);

        Escuela esc = new Escuela(a);
        System out printnl("---Informacion del alumno---");
        esc.mostrarAlumno();
    




        



    }
}