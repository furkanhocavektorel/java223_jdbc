package org.vektorel;


import org.vektorel.controller.CategoryController;
import org.vektorel.entity.Category;
import org.vektorel.repository.CategoryRepository;
import org.vektorel.utility.DbIletisim;

import java.sql.*;
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
        categoryController.createCategory("yusuf");


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