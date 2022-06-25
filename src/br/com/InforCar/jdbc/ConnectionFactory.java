package br.com.InforCar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
            public Connection getConnection () {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BDAether_Cars",
                    "IAP_AetherCars", "pcgfj");
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }
}
