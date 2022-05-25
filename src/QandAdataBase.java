
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class QandAdataBase {
    
    private static Connection connect() {  
        /* SQLite connection string*/  
        var url = "jdbc:sqlite:D:/MyDataBase/Ques&Ans.db";  
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
   public void insert(String name, String qora, String type ) {
        String sql = "INSERT INTO qANDa(UserName,Question,Answer) VALUES(?,?,?)";

        try (Connection conn = QandAdataBase.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            if(type.equals("General")) pstmt.setString(2, qora);
            else pstmt.setString(3, qora);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   public void updateAns(String user,String qus, String ans ) {
            String sql="UPDATE qANDa SET UserName = ? , "
                + "Answer = ? "
                + "WHERE Question = ?";

        try (Connection conn = QandAdataBase.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user);
            pstmt.setString(2, ans);
            pstmt.setString(3, qus);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

  
    
    public static String  getAns(String userName){  
        String sql = "SELECT * FROM qANDa";  
          
        try {
            Connection conn = QandAdataBase.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            // loop through the result set  
            while (rs.next()) {  
                
                String user = rs.getString("UserName");
                String qus = rs.getString("Question");
                String ans = rs.getString("Answer");
                if(user.equals(userName))
                {
                    if(ans!=null)
                    {
                        ans ="Your question was "+qus+"\n Here is your Ans : "+ans;
                        rs.close();
                        return ans;
                    }
                }
            }return null;
        } catch (SQLException e) {  
            
            System.out.println(e.getMessage()); 
            return null;
            
        }  
    }
    public static String[]  getQus(){  
        String sql = "SELECT * FROM qANDa";  
          String arr[]={null,null};
        try {
            Connection conn = QandAdataBase.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            // loop through the result set  
            while (rs.next()) {  
                String user = rs.getString("UserName");
                String qus = rs.getString("Question");
                String ans = rs.getString("Answer");
                if(ans==null)
                 {
                     arr[0]=user;
                     arr[1]=qus;
                     rs.close();
                      return arr;
                 }
                
            }return arr;
        } catch (SQLException e) {  
            
            System.out.println(e.getMessage()); 
            return arr;
            
        }  
    }

    public static void main(String[] args) {
        
    }
}
