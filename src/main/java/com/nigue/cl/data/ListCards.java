package com.nigue.cl.data;

import java.util.ArrayList;
import java.util.List;

public class ListCards {

    private List<EamuseCard> cards;

    public ListCards() {
        String ruta = System.getProperty("user.home") + "/AppData/Roaming/jCard/data.csv";
        String directorio = System.getProperty("user.home") + "/AppData/Roaming/jCard/";
        System.out.println("ruta: " + ruta);

        ReadCards rc = new ReadCards(ruta, directorio);

        this.cards = new ArrayList<EamuseCard>();

//        this.cards.add(new EamuseCard("miguel", "M", "POTITO"));
//        this.cards.add(new EamuseCard("ibania", "I", "HATENA"));
        this.cards.addAll(rc.getAll());

    }

    public List<EamuseCard> getCards() {
        return cards;
    }

}
