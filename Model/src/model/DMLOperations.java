package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jbo.server.DBTransaction;

public class DMLOperations {
    
    public int setNewId(DBTransaction dbt, String columnName, String tableName){
        
        Statement st = dbt.createStatement(0);
        int newId = 0;
        
        ResultSet rs;

        try {
            rs = st.executeQuery("select max ("+columnName+") from "+tableName);
            if (rs.next()) {
                newId = rs.getInt(1) + 1;
            }
            else{
                newId = rs.getInt(1);
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            System.out.println("Database Error");
        }
        return newId;
    }
    
    
    
}
