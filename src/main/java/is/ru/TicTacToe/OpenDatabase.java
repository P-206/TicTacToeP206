import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class OpenDatabase   {
	Connection conn=null;
    public static Connection dbConnector(){
        try {
        	Class.forName("org.sqlite.JDBC");
        	Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\fiddi\\TicTacToe\\Scoreboard.sqlite");
            return conn;
            // The newInstance() call is a work around for some
            // broken Java implementations

		}
         catch (Exception ex) {


            // handle the error
            return null;
        }
    }
}