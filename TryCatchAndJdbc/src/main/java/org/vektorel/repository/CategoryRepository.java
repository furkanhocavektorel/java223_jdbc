package org.vektorel.repository;

import org.vektorel.entity.Category;
import org.vektorel.utility.DbIletisim;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository{
    DbIletisim dbIletisim= new DbIletisim();


    public void createCategory(Category xxxx){
        String sqlSorgusu=
        "insert into category (name) values (?)";


        DbIletisim dbIletisim = new DbIletisim();
        Connection conn=dbIletisim.getConnection();
        try {
            PreparedStatement pr=conn.prepareCall(sqlSorgusu);
            pr.setString(1,xxxx.getName());
            pr.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            dbIletisim.closeConnection(conn);
        }
    }

    public Category getCategoryByName(String name){
        String sql= "select * from category where name ='"+name+"' ";
        Connection connection= dbIletisim.getConnection();
        try {
            Driver.class.forName("org.postgresql.Driver");
            PreparedStatement pr = connection.prepareCall(sql);
            ResultSet set = pr.executeQuery();
            Category category = new Category();
            while (set.next()){
                int tableId = set.getInt("id");
                String tableName = set.getString("name");
                category.setId(tableId);
                category.setName(tableName);
            }
            return category;
        }catch (ClassNotFoundException cnf){
            System.out.println("Driver hatasi aldık");
            cnf.printStackTrace();

        }catch (SQLException se){
            System.out.println("sql hatasi aldık muhtemelen sorgudan kaynaklı");
            se.printStackTrace();
        }finally {
            dbIletisim.closeConnection(connection);
        }

        return null;
    }

    public List<Category> getAll(){
//        DbIletisim dbIletisim= new DbIletisim();
//        Connection conn = dbIletisim.getConnection();
//
//        ResultSet set= pr.executeQuery();
        List<Category> categories = new ArrayList<>();
//        while (set.next()){
//            int id = set.getInt("id");
//            String name = set.getString("name");
//            Category category = new Category();
//            category.setId(id);
//            category.setName(name);
//            categories.add(category);
//        }
        return categories;
    }


}
