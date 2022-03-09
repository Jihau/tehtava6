package com.example.tehtava6;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Singleton extends AppCompatActivity {

    private static final Singleton instance = new Singleton();
    public static List<President> list = Arrays.asList(
            new President("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"),
            new President("Relander, Lauri Kristian", 1925, 1931, "Reissulasse"),
            new President("Svinhufvud, Pehr, Evind", 1931, 1937, "Ukko-Pekka"),
            new President("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"),
            new President("Ryti, Risto Heikki", 1940, 1944, "Nuorena Kustu Kalliokangas"),
            new President("Mannerheim, Carl Gustav", 1944, 1946, "Marski"),
            new President("Paasikivi, Juho Kusti", 1946, 1956, "Äkäinen ukko"),
            new President("Kekkonen, Urho Kaleva", 1956, 1982, "Pelimies"),
            new President("Koivisto, Mauno Henrik", 1982, 1994, "Manu"),
            new President("Ahtisaari, Martti Oiva", 1994, 2000, "Mahtisaari"),
            new President("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispressa"),
            new President("Niinistö, Sauli Väinämö", 2012, 2024, "Owner of Lennu, the First Dog"));

    public static Singleton getInstance() {
        return instance;
    }

    public List<President> getPresidents() {
        return list;
    }

    private Singleton() {
        list = new ArrayList<>();
    }
}