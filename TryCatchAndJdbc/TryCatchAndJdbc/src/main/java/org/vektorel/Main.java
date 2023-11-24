package org.vektorel;


import org.vektorel.controller.CategoryController;
import org.vektorel.entity.Category;
import org.vektorel.entity.Customer;
import org.vektorel.entity.enums.State;
import org.vektorel.repository.BaseRepository;
import org.vektorel.repository.CategoryRepository;
import org.vektorel.repository.CustomerRepository;
import org.vektorel.service.CategoryService;
import org.vektorel.service.CustomerService;
import org.vektorel.utility.DbIletisim;
import org.vektorel.utility.Singleton;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /* bu katman olarak sayılmaz
    databasede ki tabloya karşılık gelir.
     pojo -> entity, model */
    /*
    data base ile iletişime geçen katman
     db katmani -> repository ,dao(data access object)
     */
    /* kullanıcıdan alınan verileri işledigimiz
    katman.
     Eylem -> business , service
     */
    /*
    url'den gelen istekleri karşılar.
    yani bir web sayfasından atılan istekler ilk
    controller sınıfına düser.
     url -> controller
     */
    public static void main(String[] args) {

        CategoryController categoryController= new CategoryController();
        System.out.println("buraya girdi mi 2");

        categoryController.createCategory("yepisyeni");

        System.out.println("buraya girdi mi");
//        CategoryController categoryController= new CategoryController();
//        categoryController.createCategory("yusuf2");
//
//
//        CustomerRepository customerRepository = new CustomerRepository();
//
//        Customer customer1= Customer.CustomerBuilder.startBuilder()
//                .name("furkan") // --
//                .surname("türkmen") // --
//                .email("furkan@gmail.com") // --
//                .password("asdasdasdasas_2*") // --
//                .address("ankara")
//                .age(23)
//                .build();
//        CustomerService customerService = CustomerService.getInstance();

        Category category= new Category();
        category.setId(133);
        category.setName("mouse");
        category.setState(State.ACTIVE);
        category.setCreateDate(LocalDateTime.now().toString());
        category.setUpdateDate(LocalDateTime.now().toString());

        System.out.println(category.toString());

        CategoryService categoryService= new CategoryService();

//
//
//
//        System.out.println(customer1);
//
//        customer1.setName("yusuf");
//        customer1.setSurname("karaaslan");
//        customer1.setEmail("yusuf@gmail.com");
//        customer1.setPassword("asdasdasd");
//        System.out.println(customer1);
//
//
//        customerRepository.createCustomer(customer1);
//        System.out.println(customer1.toString());
//
//


        // kullanıcı olusturuyorsunuz.
        // eger kullanıcı var ise bu kategori eklenebilir
        // kullanıcı yok ise kategori eklenemez ve
        // bu mail adresinde bir kullanıcı kayıtlı degildir diye
        // ekrana bastırılır.
        // kullanıcı adını güncelleyebilir.
        // kullanıcı category silebilir.
        // bir kullanıcı yeni bir kullanıcı ekleyebilir.





        // aynı kategoriden tekrar atmasın








// insert into category (name) values ('cerez')
//        try {
//            conn=DriverManager
//                    .getConnection(url,username,password);
//            Driver.class.forName("org.postgresql.Driver");
//
//            // insert komutu
//            String sqlSorgusu=
//                    "insert into category (name,surname) values ('?','?')";
//
//          PreparedStatement pr=conn.prepareCall(sqlSorgusu);
//
//            int sorguSonucu=pr.executeUpdate();
//            System.out.println(sorguSonucu);
//
//            String selectSorgusu="select * from category";
//            PreparedStatement ps= conn.prepareCall(selectSorgusu);
//            ResultSet set=ps.executeQuery();
//
//            while (set.next()){
//
//                System.out.println("id : "+ set.getInt("id")+
//                        "  name : "+set.getString("name"));
//            }
//            System.out.println(set);
//
//
//        }catch (SQLException x){
//            System.out.println("sql hatasi aldık");
//            x.printStackTrace();
//        }catch (ClassNotFoundException cv){
//            System.out.println("class not found hatası aldık");
//            cv.printStackTrace();
//        }finally {
//            try {
//                // N-Tier arc
//                // 3-tier
//                // 2-tier
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            System.out.println("finally içi");
//        }

        // ******************************

//        System.out.println("-------");
//
//        try {
//            int bolumSonucu= 20/0;
//        }catch (Exception furkan){
//            System.out.println("asdasdaasadsdaadsdsasad");
//            furkan.printStackTrace();
//        }

//        System.out.println("adinizi giriniz");
//        String ad= src.nextLine();
//        System.out.println("***********");
//
//        List<String> asd= new ArrayList<>();
//        asd.add("furkan");
//        asd.add("türkmen000");
//
//        try {
//            asd.get(5);
//
//        }catch (Exception e){
//            System.err.println("hata eyvah");
//        }
//        System.out.println("kapandı mı");














    }
}