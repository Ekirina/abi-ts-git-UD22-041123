package appMain;

import controllers.Controlador;
import views.VistaAsignado_a;
import views.VistaCientificos;
import views.VistaPrincipal;
import views.VistaProyecto;

public class App 
{
    public static void main( String[] args )
    {
        VistaPrincipal ejercicio3 = new VistaPrincipal();
        VistaCientificos ejercicio3Cientifico = new VistaCientificos() ;
        VistaProyecto ejercicio3Proyecto = new VistaProyecto();
        VistaAsignado_a ejercicio3Asignado_a = new VistaAsignado_a();
        Controlador control = new Controlador(ejercicio3, ejercicio3Cientifico, ejercicio3Proyecto, ejercicio3Asignado_a);																										
}					
}