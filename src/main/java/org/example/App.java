package org.example;
import org.example.Uil.CreatTabil;
import org.example.Uil.Db;
import org.example.Uil.GetALL;
import org.example.Uil.Insort;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ryskeldi
 *
 * 3 таблица бар - Шаарлар, Олколор, Шаар башчылары
 *
 * Ар бир таблицага жок дегенде 5тен маалымат киргизуу керек
 *
 * Statement жана PreparedStatement-ти колдонуу
 *
 * Шаарларды жана олколорду ArrayList-ке сактоо
 * Базадан шаарды id менен алып консолго чыгарышыбыз керек
 */
public class App 
{
    public static void main( String[] args )
    {
//     CreatTabil.createTable();
//       CreatTabil.createCountry();
//        CreatTabil.createCity();
//     Insort.insertTAblePeople(1,"Sadyr japovrov",35,"Призидент");
//      Insort.insertTAblePeople(2,"Франк-Вальтер Штайнмайер",55,"Призидент");
//       Insort.insertTAblePeople(3,"Филипп VI",67,"Правитель");
//      Insort.insertTableCountries(1,"Кыргызстан",1);
//       Insort.insertTableCountries(3,"Германия",2);
//      Insort.insertTableCountries(4,"Испания",3);
//          Insort.insertTablecities(5,"biskek",1,1);
        //          Insort.insertTablecities(6,"berlin",2,2);
//          Insort.insertTablecities(7,"Madrid",3,3);
//        System.out.println(GetALL.getAllPeople());
//        System.out.println(GetALL.getAllCountry());
//        System.out.println(GetALL.getAllCity());
GetALL.getById();
    }
}
