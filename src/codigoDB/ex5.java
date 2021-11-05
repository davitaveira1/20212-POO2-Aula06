package codigoDB;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ex5 {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            
            conn = conexao.getConnection();
            
            pst = conn.prepareStatement("delete "
                    + "from usuarios "
                    + "where "
                    + "codigo = ?"
                    );
            
            pst.setInt(1, 5);
            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
        
    }
    
}
