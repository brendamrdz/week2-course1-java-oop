package model;

import java.util.ArrayList;
import java.util.Date;

import static UI.UIMenu.*;

public class Patient extends User {
private String bithday;
private double weight;
private double height;
private String blood;

private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
private  ArrayList<AppointmentDoctor> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
    AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
appointmentDoctor.schedule(date,time);
appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentDoctor> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentDoctor> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient (String name, String email){
    super(name, email);
}

    public String getBithday() {
        return bithday;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Age: " + bithday + "Weight: " + getWeight() + " Height: " + getHeight() + " Blood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}