package com.xworkz.storeapp.App;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class App {

    private int appId;
    private String appName;
    private String version;
    private String updateOn;
    private double updateSize;
    private String requiredOS;
    private String offeredBy;

//    public double getUpdateSize() {
//        return updateSize;
//    }
//
//    public void setUpdateSize(double updateSize) {
//        this.updateSize = updateSize;
//    }
//
//    public void setAppId(int appId) {
//        this.appId = appId;
//    }
//
//    public int getAppId() {
//        return appId;
//    }
//
//    public void setAppName(String appName) {
//        this.appName = appName;
//    }
//
//    public String getAppName() {
//        return appName;
//    }
//
//    public void setOfferedBy(String offeredBy) {
//        this.offeredBy = offeredBy;
//    }
//
//    public String getOfferedBy() {
//        return offeredBy;
//    }
//
//    public void setRequiredOS(String requiredOS) {
//        this.requiredOS = requiredOS;
//    }
//
//    public String getRequiredOS() {
//        return requiredOS;
//    }
//
//    public void setUpdateOn(String updateOn) {
//        this.updateOn = updateOn;
//    }
//
//    public String getUpdateOn() {
//        return updateOn;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }
//
//    public String getVersion() {
//        return version;
//    }
}
