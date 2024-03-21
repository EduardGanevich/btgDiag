package com.edganevich.springcourse.springboot.entities;

public enum Filial {
    ORSHA ("Оршанское УМГ"),
    KRUPKI ("Крупсоке УМГ"),
    ITC ("ИТЦ");

    private String title;

    Filial(String title) {
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
