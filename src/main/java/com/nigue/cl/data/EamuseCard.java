package com.nigue.cl.data;

public class EamuseCard {

    private String name;
    private String key;
    private String card;

    public EamuseCard(String name, String key, String card) {
        this.name = name;
        this.key = key;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getCard() {
        return card;
    }

}
