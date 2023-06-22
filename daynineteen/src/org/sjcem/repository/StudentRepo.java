package org.sjcem.repository;
//Program to demonstrate on CRUD operations
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sjcem.entities.Student;

public interface StudentRepo {
	/* The Statement Object used for executing a static 
	 * SQL statement and returning the results it produces */
	Statement makeStatement();
	PreparedStatement createPreparedStatement(String query);
	
	public int addQuery(String query, Student student);
	public int updateQuery(String query, Student student);
	public int deleteQuery(String query);
	public ResultSet retrieveQuery(String query);
	
}
