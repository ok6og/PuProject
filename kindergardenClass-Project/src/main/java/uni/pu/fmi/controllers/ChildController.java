package uni.pu.fmi.controllers;

import uni.pu.fmi.models.Child;
import uni.pu.fmi.models.Parent;

import static uni.pu.fmi.controllers.AdministratorController.sumPoints;

public class ChildController {

    public ChildController(){

    }

    public String registerChild(Boolean isImpaired , Boolean isTwin, Boolean hasSibling, Parent parent){
        if(isImpaired == null){
            return "Не е казано дали детето е с увреждане";
        }
        if(isTwin == null){
            return "Не е казано дали детето има близнак";
        }
        if(hasSibling == null){
            return "Не е казано дали детето има брат или сестра в учебното заведение";
        }
        if(hasSibling == false && isTwin == true){
            return  "Няма как детето да няма брат или сестра и в същото време да има близнак";
        }
        if(parent == null){
            return "Не е казано кой е родителя на детето";
        }

        return "Успешно регистрирано дете за класиране";
    }

    public int GetChildPoints(Child child){
        int points = sumPoints(child.getHasSibling(), child.getIsImpaired(), child.getIsTwin(),false);
        return points;
    }

}
