package br.com.InforCar.DAO;

import br.com.InforCar.jdbc.ConnectionFactory;
import br.com.InforCar.model.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO {
     private Connection con;
     
     public CarroDAO(){
         this.con = new ConnectionFactory().getConnection();
     }
     public void saveCar(Carro car){
         try {
             String sql = "INSERT INTO tab_carro(modelo, fabricante, data_fabricação, placa, preco)"
                     + " values(?, ?, ?, ?, ?)";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, car.getModelo());
             stmt.setString(2, car.getFabricante());
             stmt.setString(3, car.getData_fabricacao());
             stmt.setString(4, car.getPlaca());
             stmt.setDouble(5, car.getPreco());
             
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Carro registrado!");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void deleteCar(Carro car){
         try {
             String sql = "delete from tab_carro where id=?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setInt(1, car.getId());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Cliente deletado!");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void updateCar(Carro car){
         try {
             String sql = "UPDATE tab_carro SET modelo=?, fabricante=?, data_fabricação=?, placa=?, preco=?"
                        + " WHERE id = ?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, car.getModelo());
             stmt.setString(2, car.getFabricante());
             stmt.setString(3, car.getData_fabricacao());
             stmt.setString(4, car.getPlaca());
             stmt.setDouble(5, car.getPreco());
             stmt.setInt(6, car.getId());
             
             stmt.execute();
             stmt.close();

             JOptionPane.showMessageDialog(null, "Carro editado com sucesso");
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public List<Carro> listCar(){
          try{
            List<Carro> carro = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_carro";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
                Carro car = new Carro();
                
                car.setId(result.getInt("id"));
                car.setModelo(result.getString("modelo"));
                car.setFabricante(result.getString("fabricante"));
                car.setData_fabricacao(result.getString("data_fabricação"));
                car.setPlaca(result.getString("placa"));
                car.setPreco(result.getDouble("preco"));
                
                carro.add(car);
            }
            
            return carro;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
     }
     public List<Carro> pesquisaCar(String modelo){
         try{
            List<Carro> cars = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_carro WHERE modelo like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, modelo);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Carro car = new Carro();
               
                car.setId(result.getInt("id"));
                car.setModelo(result.getString("modelo"));
                car.setFabricante(result.getString("fabricante"));
                car.setData_fabricacao(result.getString("data_fabricação"));
                car.setPlaca(result.getString("placa"));
                car.setPreco(result.getDouble("preco"));
                
                cars.add(car);
            }
            
            return cars;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
     }
     
}
