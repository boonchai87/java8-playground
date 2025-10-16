package nengboonchai.jdbc;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) throws Exception{
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//localhost:1521/XE"); // jdbc:oracle:thin@//[hostname]:[port]/[DB service name]
        ods.setUser("testdb");
        ods.setPassword("testdb");
        Connection conn = ods.getConnection();

        //PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
        PreparedStatement stmt = conn.prepareStatement("select * from test1");
        ResultSet rslt = stmt.executeQuery();
        while (rslt.next()) {
            System.out.println(rslt.getString(1));
        }
    }
}
