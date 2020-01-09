package qa.tdd.mockobjects;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnect {

//        Connection getConnection(DataSource ds, String url)
//                throws SQLException {
//            MysqlDataSource mds = (MysqlDataSource) ds;
//            mds.setURL(url);
//            mds.setUser("root");
//            mds.setPassword("root");
//            Connection con = mds.getConnection();
//            return con;
//        }

        ResultSet createResults(Connection con, String sql)
                throws SQLException {
            Statement stmt = con.createStatement();
            ResultSet results = stmt.executeQuery(sql);
            return results;
        }

    }
