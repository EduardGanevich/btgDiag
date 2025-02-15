package com.edganevich.springcourse.springboot.entities;

public enum TypeOfDiagnostic {

    UZT ("Толщинометрия"),
    TO ("ТО"),
    AEC("Акустическая эмиссия"),
    TD ("ТД");

    private String title;

    TypeOfDiagnostic(String title) {
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
