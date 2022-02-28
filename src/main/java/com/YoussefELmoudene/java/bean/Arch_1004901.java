package com.YoussefELmoudene.java.bean;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@IdClass(AccountId.class)
public class Arch_1004901 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_device;
    @Id
    private LocalDateTime date;
    private int speed;
    private int fuel;
    private int temp;
    private int x;
    private int y;
    private int z;
    private int ignition;
    private int rpm;
    private int fuel_rate;
    private double tfu;
    private double odo;
    private int satInView;
    private int signal;
    private int heading;
    private int charger;
    private double latitude;
    private double longitude;
    private int state;
    private int validity;
    private int temp_engine;
    private float accum_odo;
    @Column(nullable = true)
    private Double do1;
    @Column(nullable = true)
    private Double do2;
    @Column(nullable = true)
    private Double do3;
    @Column(nullable = true)
    private Double do4;
    @Column(nullable = true)
    private Double di1;
    @Column(nullable = true)
    private Double di2;
    @Column(nullable = true)
    private Double di3;
    @Column(nullable = true)
    private Double di4;
    @Column(nullable = true)
    private Double an1;
    @Column(nullable = true)
    private Double an2;
    @Column(nullable = true)
    private Double an3;
    @Column(nullable = true)
    private Double an4;

    public Long getId_device() {
        return id_device;
    }

    public void setId_device(Long id_device) {
        this.id_device = id_device;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }


    public int getIgnition() {
        return ignition;
    }

    public void setIgnition(int ignition) {
        this.ignition = ignition;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getFuel_rate() {
        return fuel_rate;
    }

    public void setFuel_rate(int fuel_rate) {
        this.fuel_rate = fuel_rate;
    }

    public double getTfu() {
        return tfu;
    }

    public void setTfu(double tfu) {
        this.tfu = tfu;
    }

    public double getOdo() {
        return odo;
    }

    public void setOdo(double odo) {
        this.odo = odo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getSatInView() {
        return satInView;
    }

    public void setSatInView(int satInView) {
        this.satInView = satInView;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getCharger() {
        return charger;
    }

    public void setCharger(int charger) {
        this.charger = charger;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getTemp_engine() {
        return temp_engine;
    }

    public void setTemp_engine(int temp_engine) {
        this.temp_engine = temp_engine;
    }

    public float getAccum_odo() {
        return accum_odo;
    }

    public void setAccum_odo(float accum_odo) {
        this.accum_odo = accum_odo;
    }

    public Double getDo1() {
        return do1;
    }

    public void setDo1(Double do1) {
        this.do1 = do1;
    }

    public Double getDo2() {
        return do2;
    }

    public void setDo2(Double do2) {
        this.do2 = do2;
    }

    public Double getDo3() {
        return do3;
    }

    public void setDo3(Double do3) {
        this.do3 = do3;
    }

    public Double getDo4() {
        return do4;
    }

    public void setDo4(Double do4) {
        this.do4 = do4;
    }

    public Double getDi1() {
        return di1;
    }

    public void setDi1(Double di1) {
        this.di1 = di1;
    }

    public Double getDi2() {
        return di2;
    }

    public void setDi2(Double di2) {
        this.di2 = di2;
    }

    public Double getDi3() {
        return di3;
    }

    public void setDi3(Double di3) {
        this.di3 = di3;
    }

    public Double getDi4() {
        return di4;
    }

    public void setDi4(Double di4) {
        this.di4 = di4;
    }

    public Double getAn1() {
        return an1;
    }

    public void setAn1(Double an1) {
        this.an1 = an1;
    }

    public Double getAn2() {
        return an2;
    }

    public void setAn2(Double an2) {
        this.an2 = an2;
    }

    public Double getAn3() {
        return an3;
    }

    public void setAn3(Double an3) {
        this.an3 = an3;
    }

    public Double getAn4() {
        return an4;
    }

    public void setAn4(Double an4) {
        this.an4 = an4;
    }
}
