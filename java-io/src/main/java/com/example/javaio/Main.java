package com.example.javaio;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("lorem.txt");
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = bufferedReader.readLine();



        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
