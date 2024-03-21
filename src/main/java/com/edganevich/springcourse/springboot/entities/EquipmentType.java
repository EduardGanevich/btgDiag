package com.edganevich.springcourse.springboot.entities;


public enum EquipmentType {
        SRPD("СРПД"),
        USB("УСБ"),
        AVO("ИТЦ"),
        AGNKS("АГНКС"),
        GRS ("ГРС");

private String title;

    EquipmentType(String title) {
        this.title = title;
        }

public String getTitle() {
        return title;
        }

@Override
public String toString() {
        return title;
        }
}
