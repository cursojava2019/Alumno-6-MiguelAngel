package es.indra.academia.configuracion;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
	
	public Configuracion getInstance() {
		if (singleton == null) {
			singleton = new Configuracion();
		}
		return singleton;
	}
	
	public Connection obtenerConexionBD() throws SQLException, ClassNotFoundException {
		String url = this.parametros.getProperty("bbdd.url");
		String usuario = this.parametros.getProperty("bbdd.usuario");
		String password = this.parametros.getProperty("bbdd.password");
		Class.forName("org.postgresql.Driver");
		Connection co = DriverManager.getConnection(url, usuario, password);
		
		return co;
	}
	
	public String obtenerParametros(String parametro) {
		return this.parametros.getProperty(parametro);
	}
}
