package es.academia.configuracion;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import es.indra.model.support.DatosConexion;

public class Configuracion {
	
	private static Configuracion singleton = null;
	private static String fichero = "configuracion.properties";
	
	Properties parametros;
	
	private Configuracion( ) {
		try {
			this.parametros = new Properties();
			InputStream propertiesStream = ClassLoader.getSystemResourceAsStream("fichero");
			this.parametros.load(propertiesStream);
			propertiesStream.close();
		} catch (Exception e) {
			
		}
	}
	
	public Configuracion getInstace() {
		if (singleton == null) {
			singleton = new Configuracion();
		}
		return singleton;
	}
	
	public Connection obtenerConexionBD() throws SQLException{
		String url = this.parametros.getProperty("bbdd.url");
		String usuario = this.parametros.getProperty("bbdd.usuario");
		String password = this.parametros.getProperty("bbdd.password");
		Connection co = DriverManager.getConnection(url, usuario, password);
		
		return co;
	}
	
	public String obtenerParametros(String parametro) {
		return this.
	}
}
