package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    private  ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    //private ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
       return itemDAO.getAll();
    }

    @Override
    public boolean  deleteItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
       return itemDAO.update(dto);
    }

    @Override
    public boolean itemExist(String code) throws SQLException, ClassNotFoundException {
       return itemDAO.exist(code);
    }

    @Override
    public String generateNewItemCode() throws SQLException, ClassNotFoundException {
       return itemDAO.generateNewID();
    }
}
