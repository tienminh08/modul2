package com.example.jdbcexam_trantienmanh.Service;

import com.example.jdbcexam_trantienmanh.Dao.StundentDao;
import com.example.jdbcexam_trantienmanh.Model.Stundent;

import java.util.List;

public class Service {


    public static List<Stundent> getall() {
        return StundentDao.getall();
    }
    public static void Delete(int id) {
        StundentDao.Delete(id);
    }
    public static void Crate(Stundent stundent) {
        StundentDao.Crate(stundent);
    }


    public static void Edit (Stundent stundent ){
        StundentDao.Edit(stundent);
    }

    public static Stundent findByStudent(int id) {
      return   StundentDao.findByStudent(id);
    }
}
