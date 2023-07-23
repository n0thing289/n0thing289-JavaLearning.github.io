package service;

import dao.MenuDAO;
import domain.Menu;

import java.util.List;

public class MenuService{
    private MenuDAO menuDAO = new MenuDAO();

    public List<Menu> getAllMenus(){
        String sql = "select * from menu";
        List<Menu> menus = menuDAO.queryMultiply(sql, Menu.class);
        return menus;
    }

    public double getPriceByMenuId(int menuId){
        String sql = "select price from menu where id = ?";
        double price = (Double)menuDAO.queryScalar(sql, menuId);
        return price;
    }

    public Menu getMenuById(int menuId){
        String sql = "select * from menu where id = ?;";
        Menu menu = menuDAO.querySingle(sql, Menu.class, menuId);
        return menu;
    }
}
