package uni.pu.fmi.administrator;

import uni.pu.fmi.controllers.AdministratorController;

import java.util.ArrayList;

public class AdministratorPageModel {

    ArrayList<Boolean> boolsForPoints = new ArrayList<>();

    public ArrayList<Boolean> getBoolsForPoints() {return this.boolsForPoints;}
    public void setBoolsForPoints(boolean b1) {this.boolsForPoints.add(b1);}
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void clickButton(){
        AdministratorController administratorController = new AdministratorController();
        message = AdministratorController.classChild(boolsForPoints);
    }
}
