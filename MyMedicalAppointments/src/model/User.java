package model;

import model.Doctor;
import model.Patient;

import java.util.Date;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + "Email: " + email + " Address: " + address + " Phone: " + phoneNumber;
    }
    public abstract void showDataUser();

    public static class Main {
        public static void main(String[] args) {
             //showMenu();
            Doctor myDoctor = new Doctor("Brenda Rodriguez", "q@q.com");
            //myDoctor.addAvailableAppointment(new Date(), "4pm");
            //myDoctor.addAvailableAppointment(new Date(), "10am");
            //myDoctor.addAvailableAppointment(new Date(), "1pm");
            System.out.println(myDoctor);
            //for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointment()){
            //    System.out.println(aA.getDate() + "" + aA.getTime());
            //}

            Patient patient = new Patient("Alejandra Alejandra Alejandra", "ale@example.com");
            System.out.println(patient);
        }
    }
}
