package br.com.InforCar.DAO;

import br.com.InforCar.jdbc.ConnectionFactory;
import br.com.InforCar.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
     private Connection con;
     
     public ClienteDAO(){
         this.con = new ConnectionFactory().getConnection();
     }
     public void saveCli(Cliente cli){
         try {
             String sql = "INSERT INTO tab_cliente(nome, email, celular, cpf, rg, idade)"
                     + " values(?, ?, ?, ?, ?, ?)";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, cli.getNome());
             stmt.setString(2, cli.getEmail());
             stmt.setString(3, cli.getCelular());
             stmt.setString(4, cli.getRg());
             stmt.setString(5, cli.getCpf());
             stmt.setString(6, cli.getIdade());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Cliente registrado!");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void deleteCli(Cliente cli){
         try {
             String sql = "delete from tab_cliente where id=?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setInt(1, cli.getId());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Cliente deletado!");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void updateCli(Cliente cli){
         try {
             String sql = "UPDATE tab_cliente SET nome=?, email=?, celular=?, rg=?, cpf=?, idade=?"
                        + " WHERE id = ?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, cli.getNome());
             stmt.setString(2, cli.getEmail());
             stmt.setString(3, cli.getCelular());
             stmt.setString(4, cli.getRg());
             stmt.setString(5, cli.getCpf());
             stmt.setString(6, cli.getIdade());
             stmt.setInt(7, cli.getId());
             
             stmt.execute();
             stmt.close();

             JOptionPane.showMessageDialog(null, "Cliente editado com sucesso");
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public List<Cliente> listCli(){
          try{
            List<Cliente> cliente = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
                Cliente cli = new Cliente();
                
                cli.setId(result.getInt("id"));
                cli.setNome(result.getString("nome"));
                cli.setEmail(result.getString("email"));
                cli.setCelular(result.getString("celular"));
                cli.setCpf(result.getString("cpf"));
                cli.setRg(result.getString("rg"));
                cli.setIdade(result.getString("idade"));
                
                cliente.add(cli);
            }
            
            return cliente;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
     }
     public List<Cliente> pesquisaCli(String nome){
         try{
            List<Cliente> clis = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_cliente WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Cliente cli = new Cliente();
                cli.setId(result.getInt("id"));
                cli.setNome(result.getString("nome"));
                cli.setEmail(result.getString("email"));
                cli.setCelular(result.getString("celular"));
                cli.setCpf(result.getString("cpf"));
                cli.setRg(result.getString("rg"));
                cli.setIdade(result.getString("idade"));
                
                clis.add(cli);
            }
            
            return clis;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
     }
     
}
