package codigoDB;

import db.conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            conn = conexao.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from usuarios");
            
            int codigo;
            String login;
            String senha;
            
            while(rs.next()){
                
                codigo = rs.getInt("codigo");
                login = rs.getString("login");
                senha = rs.getString("senha");
                
                System.out.println(codigo+" | "+login+ " | "+ senha);               
            }     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
        
        
    }
    
}
