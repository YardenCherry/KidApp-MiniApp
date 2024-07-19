package com.example.kidapp.ExternalModels.utils;

public class CommandId {

    private String superapp;
    private String miniapp;
    private String id;

    public CommandId() {
    }


    public String getSuperapp() {
        return superapp;
    }

    public void setSuperapp(String superapp) {
        this.superapp = superapp;
    }

    public String getMiniapp() {
        return miniapp;
    }

    public void setMiniapp(String miniapp) {
        this.miniapp = miniapp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CommandId:/n " + "{superapp=" + superapp + "/n" + ", miniapp=" + miniapp + "/n, id=" + id + "}";
    }

}
