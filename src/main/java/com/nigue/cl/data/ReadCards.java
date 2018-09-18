package com.nigue.cl.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCards {

    public String fileList;
    public String directorio;

    public ReadCards(String ruta, String directorio) {
        this.fileList = ruta;
        this.directorio = directorio;

    }

    public List<EamuseCard> getAll() {

        List<EamuseCard> result = new ArrayList<EamuseCard>();
        try {

            File fileDir = new File(directorio);

            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }

            File file = new File(fileList);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            result.addAll(getDataFromFile(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<EamuseCard> getDataFromFile(File csvFile) {
        List<EamuseCard> result = new ArrayList<EamuseCard>();
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] l = line.split(cvsSplitBy);

                result.add(new EamuseCard(l[0], l[1], l[2]));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}
