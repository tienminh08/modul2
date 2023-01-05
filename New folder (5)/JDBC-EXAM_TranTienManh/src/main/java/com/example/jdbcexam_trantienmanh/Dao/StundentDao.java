package com.example.jdbcexam_trantienmanh.Dao;

import com.example.jdbcexam_trantienmanh.Model.Stundent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StundentDao {
    static Connection connection = ConnectionMySql.getconnection();


    public static List<Stundent> getall() {
        List<Stundent> ListStudnet = new ArrayList<>();
        String Sql = "SELECT * FROM testmodul3.student join classroom on student.Classroom= classroom.idClassroom;";


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("idStudent");
                String name = resultSet.getString("Name");
                String Date = resultSet.getString("DateofBirth");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone Number");
                String Email = resultSet.getString("Email");
                int clas = resultSet.getInt("class");

                Stundent stundent = new Stundent(id, name, Date, Address, Phone, Email, clas);

                ListStudnet.add(stundent);

            }
            return ListStudnet;

        } catch (Exception e) {

        }
        return null;
    }

    public static void Delete(int id) {
        String sql1 = "SET FOREIGN_KEY_CHECKS=OFF; ";
        String sql = "delete FROM testmodul3.student where idStudent= " + id;
        String sql3 = "SET FOREIGN_KEY_CHECKS=ON;";


        try {
            Statement statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(sql);
            statement.execute(sql3);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static void Crate(Stundent stundent) {
        String sql = "INSERT INTO `testmodul3`.`student` (`Name`, `DateofBirth`, `Address`, `Phone Number`" +
                ", `Email`, `Classroom`) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, stundent.getName());
            preparedStatement.setString(2, stundent.getDateofBirth());
            preparedStatement.setString(3, stundent.getAddress());
            preparedStatement.setString(4, stundent.getPhoneNumber());
            preparedStatement.setString(5, stundent.getEmail());
            preparedStatement.setInt(6, stundent.getClassroom());
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void Edit(Stundent stundent) {
        String sql = "UPDATE `testmodul3`.`student` SET `Name` =?, `DateofBirth` = ?, `Address` = ?, `Phone Number` = ?, `Email` = ?, `Classroom` = ? WHERE `idStudent` = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(7, stundent.getId());
            preparedStatement.setString(1, stundent.getName());
            preparedStatement.setString(2, stundent.getDateofBirth());
            preparedStatement.setString(3, stundent.getAddress());
            preparedStatement.setString(4, stundent.getPhoneNumber());
            preparedStatement.setString(5, stundent.getEmail());
            preparedStatement.setInt(6, stundent.getClassroom());
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static Stundent findByStudent(int id) {
        String sql = "SELECT * FROM testmodul3.student where idStudent= " + id;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            resultSet.next();

            String name = resultSet.getString("Name");
            String Date = resultSet.getString("DateofBirth");
            String Address = resultSet.getString("Address");
            String Phone = resultSet.getString("Phone Number");
            String Email = resultSet.getString("Email");
            int clas = resultSet.getInt("class");
            return new Stundent(id, name, Date, Address, Phone, Email, clas);


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }


}
