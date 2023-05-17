package uni.pu.fmi.controllers;

import uni.pu.fmi.models.Parent;

public class ParentController {

    ParentController(){}

    public String registerParent(Boolean isWorking){
        if(isWorking == null){
            return "Не е казано дали родителя  е работещ";
        }
        return "Успешно ресистриран родител";
    }

    public int getParentPoints(Parent parent){
        if (parent.getIsWorking() == true){
            return 1;
        }
        else{
            return 0;
        }
    }
}
