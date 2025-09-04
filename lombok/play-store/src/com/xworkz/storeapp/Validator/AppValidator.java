package com.xworkz.storeapp.Validator;

import com.xworkz.storeapp.App.App;

public class AppValidator {

    App app;

    public static boolean appValidator(App app){
          boolean appValidator=false;
          boolean appId=false;
          if(app.getAppId()>0){
              appId=true;
          }
          else
              System.out.println("The app id is invalid");


          boolean appName=false;
          if(app.getAppName()!=null && !app.getAppName().isEmpty()){
              appName=true;
          }
          else
              System.out.println("The name is invalid");

          boolean updateOn=false;
          if(app.getUpdateOn()!=null && !app.getUpdateOn().isEmpty()){
              updateOn=true;
          }
          else
              System.out.println("The update on is invalid");

          boolean updateSize=false;
          if(app.getUpdateSize()!=0){
              updateSize=true;
          }
          else
              System.out.println("the update size is invalid");
          boolean version=false;
        if(app.getVersion()!=null && !app.getVersion().isEmpty()){
            version=true;
        }
        else
            System.out.println("The version is invalid");
          boolean requiredOS=false;
        if(app.getRequiredOS()!=null && !app.getRequiredOS().isEmpty()){
            requiredOS=true;
        }
        else
            System.out.println("The required os is invalid");
          boolean offeredBy=false;
        if(app.getOfferedBy()!=null && !app.getOfferedBy().isEmpty()){
            offeredBy=true;
        }
        else
            System.out.println("The offered by is invalid");

        if(appId && appName && version && requiredOS && updateSize && updateOn && offeredBy){
            appValidator=true;

        }
        return appValidator;
    }


}
