package edu.upc.dsa.models;
import java.util.List;
import java.util.ArrayList;

public class UsuarioExamen {
    String username;
    String avatar;
    String name;
    String surname;
    List<badges> badges = new ArrayList<>();

    public UsuarioExamen() {
    }

    public UsuarioExamen(String username, String avatar, String name, String surname, List<badges> badges) {
        this.username = username;
        this.avatar = avatar;
        this.name = name;
        this.surname = surname;
        this.badges = badges;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<badges> getBadges() {
        return badges;
    }

    public void setBadges(List<badges> badges) {
        this.badges = badges;
    }
}
