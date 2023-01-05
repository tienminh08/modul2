package com.example.jdbcexam_trantienmanh.Model;

public class Stundent {
    private  int id;
    private String name;
    private  String DateofBirth;
    private  String Address;
    private String PhoneNumber;
    private String Email;
    private int Classroom;

    public Stundent(int id, String name, String dateofBirth, String address, String phoneNumber, String email, int classroom) {
        this.id = id;
        this.name = name;
        DateofBirth = dateofBirth;
        Address = address;
        PhoneNumber = phoneNumber;
        Email = email;
        Classroom = classroom;
    }

    public Stundent(String name, String dateofBirth, String address, String phoneNumber, String email, int classroom) {

        this.name = name;
        DateofBirth = dateofBirth;
        Address = address;
        PhoneNumber = phoneNumber;
        Email = email;
        Classroom = classroom;
    }

    public Stundent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getClassroom() {
        return Classroom;
    }

    public void setClassroom(int classroom) {
        Classroom = classroom;
    }
}
