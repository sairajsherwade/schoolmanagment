package com.jsp.schoolmanagmentsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helperclass {
	
	       
		  String url = "jdbc:mysql://localhost:3306/javabatch";
			String username ="root";
			String password="t#9758@QLPH";
			Connection connection=null;
			    
			
			
	  
	        public Connection getconnection() {
	        	try {
	    			//load /register the drivers
	    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		// establish the connection
	    			connection = DriverManager.getConnection(url, username, password);
	    			}catch (ClassNotFoundException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    				
	    			} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	return connection;
	        }
       
    }