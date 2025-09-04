package com.xworkz.storeapp;

import com.xworkz.storeapp.App.App;
import com.xworkz.storeapp.PlayStore.PlayStore;

public class PlayStoreRunner {

    public static void main(String[] args) {

        App app = new App();
        app.setAppId(1);
        app.setAppName("Whatsapp");
        app.setUpdateSize(10.25);
        app.setUpdateOn("4/aug/2025");
        app.setVersion("7.0");
        app.setOfferedBy("Whatsapp LLC ");
        app.setRequiredOS("Android");

        PlayStore playstore = new PlayStore();
        boolean res = playstore.addApplication(app);
        if (res) {
            playstore.getPlayStoreInfo();

        } else
            System.out.println("the res is invalid");

    }
}
