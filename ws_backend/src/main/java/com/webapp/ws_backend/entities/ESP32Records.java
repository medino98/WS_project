package com.webapp.ws_backend.entities;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "esp32_weather_records")
public class ESP32Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int windSpeed;
    private int windDirection;
    private float temperature;
    private float pressure;
    private float humidity;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp", updatable = false, insertable = false, nullable = false)
    private Date createdAt;

    public ESP32Records() {
    }

    public ESP32Records(int windSpeed, int windDirection, float temperature, float pressure, float humidity) {
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "wind_speed", nullable = false)
    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Column(name = "wind_direction", nullable = false)
    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    @Column(name = "temperature", nullable = false)
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Column(name = "pressure", nullable = false)
    public float getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Column(name = "humidity", nullable = false)
    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

}
