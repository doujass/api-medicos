package com.example.javaio.domain;

import java.time.LocalDateTime;

public class Registered {

    private LocalDateTime localDateTime;
    private int age;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
