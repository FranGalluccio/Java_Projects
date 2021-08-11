package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Connettore {

	private Connettore() {}
	private static Connettore instance = null;	
	public static Connettore getInstance() {
		if(instance == null) {
			instance = new Connettore();
		}
		return instance;
	}
	
	private Connection conn = null;
	//definisci le costanti utili alla connessione
	private final String URLDB = "jdbc:mysql://localhost:3306/jdbcdb";
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
	
	public Connection apriConnessione(){
		try {
			Class.forName(DRIVER); //indichiamo al compilatore quale tipo di DBMS utilizziamo, e quale lib JDBC
			conn = DriverManager.getConnection(URLDB, USERNAME, PASSWORD); // inseriamo i dati utili alla connessione=socket, user, psw
		//il get connection mi ritorna un oggetto di classe anonima (una classe non dischiarata esplicitamente, 
		//quindi non ha un nome, che implementa Connection)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
