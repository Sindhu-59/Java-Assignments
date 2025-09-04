package com.xworkz.storeapp.PlayStore;

import com.xworkz.storeapp.App.App;
import com.xworkz.storeapp.Validator.AppValidator;

public class PlayStore {

    App app;

    public boolean addApplication(App app) {
        boolean addApplication = false;
        boolean isAppInfoValid = false;

        isAppInfoValid = AppValidator.appValidator(app);
        if (isAppInfoValid) {
            addApplication = true;
            this.app = app;
        }
        return isAppInfoValid;
    }

    public void getPlayStoreInfo(){
        System.out.println("The app id is "+app.getAppId());
        System.out.println("The name is "+app.getAppName());
        System.out.println("The updation is "+app.getUpdateOn());
        System.out.println("the update size is "+app.getUpdateSize());
        System.out.println("The version is "+app.getVersion());
        System.out.println("The required os is "+app.getRequiredOS());
        System.out.println("The offered by is "+app.getOfferedBy());
    }
}
