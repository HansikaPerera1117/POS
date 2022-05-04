package dao;

import javafx.scene.control.Alert;
import model.CustomerDTO;
import model.ItemDTO;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PlaceOrderDAO {
     CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

     ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException ;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

     boolean existItem(String code) throws SQLException, ClassNotFoundException ;

     String generateNewOrderId();

     ArrayList<CustomerDTO> loadAllCustomerIds() throws SQLException, ClassNotFoundException ;

     ArrayList<ItemDTO> loadAllItemCodes() throws SQLException, ClassNotFoundException ;

     void saveOrder();
}
