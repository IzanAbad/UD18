import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;


public class funcionesBD{

	static Connection conexion;
	
public void connectionDB() {
			
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.134:3306?useTimezone=true&serverTimezone=UTC","remote","2016@Diciembre");
			System.out.println("Succesfully Connected!");
			
		}catch(SQLException | ClassNotFoundException ex) {
			System.out.println("No se ha podido conectar  a la base de datos");
			System.out.println(ex);
		}
}

public void closeConnection() {
		try {
			conexion.close();
			System.out.println("Se ha finalizado la conexion a la base de datos");
			
		}catch(SQLException ex) {
			Logger.getLogger(funcionesBD.class.getName()).log(Level.SEVERE, null,ex);
			System.out.println("Error al desconectarse de la base de datos");
		}

}
public void createDB(String nombre) {
	
	try {
		String Query = "CREATE DATABASE "+nombre;
		Statement st = conexion.createStatement();
		st.executeUpdate(Query);
		System.out.println("Se ha creado correctamente la base de datos "+nombre);
	}catch(SQLException ex) {
		Logger.getLogger(funcionesBD.class.getName()).log(Level.SEVERE, null,ex);
	}
	
	
}
public void createTable(String db, String query) {
	
	try {
		String Querydb = "USE "+db+";";
		Statement stdb = conexion.createStatement();
		stdb.executeUpdate(Querydb);
		
		Statement st=conexion.createStatement();
		st.executeUpdate(query);
		System.out.println("Tabla creada correctamente");
		
	}catch(SQLException ex){
		
		System.out.println(ex.getMessage());
		System.out.println("Error creando tabla.");
}

}
public static void insertData(String db, String datos) {
	
	try {
		String Querydb = "USE "+db+";";
		Statement stdb= conexion.createStatement();
		stdb.executeUpdate(Querydb);
		
		Statement st = conexion.createStatement();
		st.executeUpdate(datos);
		System.out.println("Datos insertados correctamente");
		
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
		System.out.println("Error insertando los valores");
	}
	

}


}