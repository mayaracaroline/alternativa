package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection getConnection(){
		
		String url = "jdbc:mysql://localhost:3306/livraria";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, "root", "");
		}catch(Exception e){
			System.out.println("Conex�o n�o abriu");
			throw new RuntimeException(e);
		}
	}
}
