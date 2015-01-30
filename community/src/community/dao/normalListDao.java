package community.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.*;
import db.*;

import db.DBConnect;

public class normalListDao {
	 private Connection con;
	 private PreparedStatement stmt;
	 private ResultSet rs;
	 
	 public void close() {
		 	if(con!= null) try{rs.close();} catch (Exception e) {}
		 	if(stmt!= null) try{rs.close();} catch (Exception e) {}
		 	if(rs!= null) try{rs.close();} catch (Exception e) {}
	 }
	 public Integer getList() {
		 
		try {
			con = (Connection) DBConnect.getConnect();
			con.setAutoCommit(false);
			
			//stmt = con.prepareStatement(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		 
	 }
}
