package codigoDB;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ex4 {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pst = null;
        
        try {
            
            conn = conexao.getConnection();
            
            pst = conn.prepareStatement("update usuarios "
                    + "set login = ?, senha = ? "
                    + "where "
                    + "codigo = ?"          
            );
            
            pst.setString(1, "davi taveira");
            pst.setString(2, "ifg");
            pst.setInt(3,1);
            
            pst.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }

    }

}
