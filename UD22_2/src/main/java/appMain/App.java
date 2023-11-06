package appMain;

import controllers.Controlador;
import views.Vista;
import views.VistaInsert;

public class App 
{
    public static void main( String[] args )
    {
    	Vista ejercicio2 = new Vista();
        Controlador control2 = new Controlador(ejercicio2);
        VistaInsert entrada2 = new VistaInsert();
    }
}
