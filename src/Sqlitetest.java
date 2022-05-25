import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class Sqlitetest {  
   
    private static Connection connect() {  
        /* SQLite connection string*/  
        var url = "jdbc:sqlite:C:/Users/User/Desktop/test.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
            System.out.println("Connection Established");
        } catch (SQLException e) {  
            System.out.println("Opps failed");
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }   
   
  
    public static void selectAll(){  
        String sql = "SELECT * FROM tasbih";  
          
        try {
            Connection conn = Sqlitetest.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            // loop through the result set  
            while (rs.next()) {  

                int gid = rs.getInt("id");
                String gHadith = rs.getString("hadith");
                String gquestion = rs.getString("question");
                System.out.println(gid + " " + gHadith + " "+gquestion); 
                if(gid==23)
                {
                    break;
                }
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    public static void main(String[] args) {
        selectAll();
    }
}
