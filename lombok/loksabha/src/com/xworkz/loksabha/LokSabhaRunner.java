package com.xworkz.loksabha;

import com.xworkz.loksabha.lok.LokSabha;

public class LokSabhaRunner {

        public static void main(String[] args) {

            LokSabha lokSabha = new LokSabha();

            Politician p1 = new Politician();
            p1.setPoliticianName("Narendra Modi");
            lokSabha.addPolitician(p1);

            Politician p2 = new Politician();
            p2.setPoliticianName("Amit Shah");
            lokSabha.addPolitician(p2);

            Politician p3 = new Politician();
            p3.setPoliticianName("Rahul Gandhi");
            lokSabha.addPolitician(p3);

            Politician p4 = new Politician();
            p4.setPoliticianName("Sonia Gandhi");
            lokSabha.addPolitician(p4);

            Politician p5 = new Politician();
            p5.setPoliticianName("Nirmala Sitharaman");
            lokSabha.addPolitician(p5);

            Politician p6 = new Politician();
            p6.setPoliticianName("Rajnath Singh");
            lokSabha.addPolitician(p6);

            Politician p7 = new Politician();
            p7.setPoliticianName("Smriti Irani");
            lokSabha.addPolitician(p7);

            Politician p8 = new Politician();
            p8.setPoliticianName("Sharad Pawar");
            lokSabha.addPolitician(p8);

            Politician p9 = new Politician();
            p9.setPoliticianName("Arvind Kejriwal");
            lokSabha.addPolitician(p9);

            Politician p10 = new Politician();
            p10.setPoliticianName("Mamta Banerjee");
            lokSabha.addPolitician(p10);

            Politician p11 = new Politician();
            p11.setPoliticianName("Yogi Adityanath");
            lokSabha.addPolitician(p11);


            lokSabha.getAllPoliticianDetails();
        }
    }


