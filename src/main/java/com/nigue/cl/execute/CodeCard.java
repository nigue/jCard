package com.nigue.cl.execute;

import com.nigue.cl.data.EamuseCard;
import com.nigue.cl.data.ListCards;
import com.nigue.cl.file.ChangeFile;

public class CodeCard {

    private String keyText;

    public CodeCard(String data) {
        this.keyText = data.split(",")[2].substring(data.split(",")[2].length() - 1);
    }

    public void execute(){
        
        ListCards cards = new ListCards();
        
        for (EamuseCard c:cards.getCards()){
            if (c.getKey().equals(keyText)){
                System.out.println("Encontrado: " + c.getName());
                ChangeFile cf = new ChangeFile(c.getCard());
                cf.execute();
            }
        }
    }
    
}
