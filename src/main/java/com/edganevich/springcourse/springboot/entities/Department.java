package com.edganevich.springcourse.springboot.entities;

public enum Department {

    LES ("Служба ЛЭС"),
    GRS ("Служба ГРС"),
    GKS ("Служба ГКС"),
    SS("Служба Связи");


    private String title;

    Department(String title) {
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
