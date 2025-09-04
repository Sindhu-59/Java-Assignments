package com.xworkz.gitag;

import com.xworkz.gitag.GiTag.GiTag;

public class GiTagRunner {

        public static void main(String[] args) {
            System.out.println("Main Started - GiTag Data");

            GiTag giTag= new GiTag();
            giTag.setCategory("egfsh");
            System.out.println("category:"+giTag.getCategory());
             }
    }

