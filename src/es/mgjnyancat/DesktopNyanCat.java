package es.mgjnyancat;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import es.mgj.nyancat.main.NyanCat;
import es.mgj.nyancat.util.Constantes;


public class DesktopNyanCat {

	public static void main(String[] args) {
		
			LwjglApplicationConfiguration configuracion = new LwjglApplicationConfiguration();
			configuracion.title = "Frogger";

			configuracion.width = Constantes.SCREEN_WIDTH;
			configuracion.height = Constantes.SCREEN_HEIGHT;
					
			new LwjglApplication(new NyanCat(), configuracion);
		

	}

}
