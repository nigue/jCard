package com.nigue.cl.data;

import java.util.ArrayList;
import java.util.List;

public class ListCards {

    private List<EamuseCard> cards;

    public ListCards() {
    
        this.cards = new ArrayList<EamuseCard>();
    
        this.cards.add(new EamuseCard("miguel", "M", "POTITO"));
        this.cards.add(new EamuseCard("ibania", "I", "HATENA"));
        
    }

    public List<EamuseCard> getCards() {
        return cards;
    }
    
}
