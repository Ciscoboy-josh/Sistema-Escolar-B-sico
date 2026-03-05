public class Main{
    public static void main(String[]args){
        Pedir_datos pd= new Pedir_datos();

        Alumno a = new Alumno();
        String nombre = pd.pedircadna("Nombre del alumno");
        int matricula = pd.pedirEntero("Matricula");
        double calificacion1= pd.pedirDecimal("Calificacion 1",0,10);
        double calificacion2 = pd.pedirDecimal("Calificacion 2",0,10);
        double calificacion3 = pd.pedirDecimal("Calificacion 3",0,10);
        double promedio = pd.pedirDecimal("Promedio final");

        Alumno a= new Alumno (nombre,matricula,calificacion1,calificacion2,calificacion3,promedio);

        Escuela esc = new Escuela(a);
        System.out.printnl("---Informacion del alumno---");
        esc.mostrarAlumno();
    




        



    }
}