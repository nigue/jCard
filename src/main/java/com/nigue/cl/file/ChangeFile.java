package com.nigue.cl.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeFile {

    private String toPut;
    private String fileCard;

    public ChangeFile(String toPut) {
        this.toPut = toPut;
        this.fileCard = System.getProperty("user.home") + "/AppData/Roaming/jCard/card0.txt";
    }

    public void execute() {

        try {

            String content = toPut;

            File file = new File(fileCard);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
