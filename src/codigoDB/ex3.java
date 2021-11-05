package codigoDB;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ex3 {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = conexao.getConnection();
            
            pst = conn.prepareStatement("insert into usuarios "
            + "(login,senha) "
            + "values (?,?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            
            pst.setString(1, "jales");
            pst.setString(2, "123");
            
            pst.executeUpdate();            
               
            rs = pst.getGeneratedKeys();
            
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1));
            }
                    
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
        
    }
    
}
