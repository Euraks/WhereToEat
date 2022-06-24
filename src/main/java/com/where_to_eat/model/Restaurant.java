/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat.model;

public class Restaurant {
    private int voice;
    private int id;
    private String name;
    private Menu menu;

    public Restaurant(int id, String name, Menu menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
