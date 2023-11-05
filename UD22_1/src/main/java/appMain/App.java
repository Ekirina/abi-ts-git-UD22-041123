package appMain;

import controllers.Controlador;
import views.Vista;
import views.VistaInsert;
public class App 
{
    public static void main( String[] args )
    {
        Vista ejercicio1 = new Vista();
        Controlador control = new Controlador(ejercicio1);
        VistaInsert entrada = new VistaInsert();
    }
}
