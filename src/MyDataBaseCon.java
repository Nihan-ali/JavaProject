
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class MyDataBaseCon {
    private static Connection connect() {  
        /* SQLite connection string*/  
        var url = "jdbc:sqlite:D:/MyDataBase/UserInfo.db";  
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
   public void insert(String name, String pass, String type ) {
        String sql = "INSERT INTO UserInfo(UserName,Password,Type) VALUES(?,?,?)";

        try (Connection conn = MyDataBaseCon.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, pass);
            pstmt.setString(3, type);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
  
    public static boolean check(String userName, String passWord,String typ){  
        String sql = "SELECT * FROM UserInfo";  
          
        try {
            Connection conn = MyDataBaseCon.connect();  
            ResultSet rs;
            try (Statement stmt = conn.createStatement()) {
                rs = stmt.executeQuery(sql);
                // loop through the result set
                while (rs.next()) {
                    String user = rs.getString("UserName");
                    String pass = rs.getString("Password");
                    String type = rs.getString("Type");
                    if(user.equals(userName)&&pass.equals(passWord)&&type.equals(type))
                    {
                        stmt.close();
                        rs.close();
                        return true;
                    }
                }
            }
            rs.close();
            return false;
        } catch (SQLException e) {  
            
            System.out.println(e.getMessage()); 
            return false;
        }  
    }

    public static void main(String[] args) {
        
    }
    
}
