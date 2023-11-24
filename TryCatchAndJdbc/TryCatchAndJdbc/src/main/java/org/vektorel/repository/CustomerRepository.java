package org.vektorel.repository;

import org.vektorel.entity.Category;
import org.vektorel.entity.Customer;
import org.vektorel.utility.DbIletisim;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// T= Customer
public class CustomerRepository implements BaseRepository<Customer> {
    DbIletisim dbIletisim = null;
    Connection connection=null;



    @Override
    public void save(Customer asd) {
        String sql=
                "insert into customers(name,surname,email,password) " +
                        "values (?,?,?,?)";
        connection=dbIletisim.getConnection(); // köprü acildi
        try {
            PreparedStatement pr= connection.prepareCall(sql);
            pr.setString(1,asd.getName());
            pr.setString(2,asd.getSurname());
            pr.setString(3,asd.getEmail());
            pr.setString(4,asd.getPassword());

            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            dbIletisim.closeConnection(connection);

        }
    }



}
