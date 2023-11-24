package org.vektorel.entity;

import org.vektorel.entity.enums.Gender;
import org.vektorel.entity.enums.State;

public class Customer {



    private String name;
    private String secondName;
    private String surname;
    private int age;
    private String email;
    private String password;
    private String address;
    private String phone;
    private Gender gender;

    public Customer() {
    }

    public Customer( String name, String secondName, String surname, int age, String email, String password, String address, String phone, Gender gender) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                '}';
    }



    public static class CustomerBuilder{
        private int id;
        private String name;// furkan
        private String secondName;
        private String surname; // asdadas
        private int age;
        private String email;
        private String password;
        private String address;
        private String phone;
        private Gender gender;
        public static CustomerBuilder startBuilder(){
            return new CustomerBuilder();
        }
        public Customer build(){
            Customer customer = new Customer();
            customer.setSurname(surname);
            customer.setName(name);
            customer.setPassword(password);
            customer.setEmail(email);
            customer.setAddress(address);
            customer.setAge(age);
            customer.setPhone(phone);
            customer.setSecondName(secondName);
            customer.setGender(gender);
            return customer;
        }


        public CustomerBuilder id(int id) {
            this.id = id;
            return this;

        }

        public CustomerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public CustomerBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder password(String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder address(String address) {
            this.address = address;
            return this;
        }

        public CustomerBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public CustomerBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }
    }



}
