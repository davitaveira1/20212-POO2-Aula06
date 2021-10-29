package codigoDB;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ex2 {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try {
            
            conn = conexao.getConnection();
            pst = conn.prepareStatement("insert into usuarios (login,senha) values (?,?)");
            
            pst.setString(1,"joaquim");
            pst.setString(2,"abc");
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
        
        
    }
    
}
