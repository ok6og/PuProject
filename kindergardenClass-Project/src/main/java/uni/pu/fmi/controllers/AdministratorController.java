package uni.pu.fmi.controllers;

import uni.pu.fmi.DB;
import uni.pu.fmi.models.Child;

import java.util.ArrayList;

public class AdministratorController {
    public AdministratorController(){

    }

    public static String classChild(ArrayList<Boolean> boolsForPoints){
        int sumOfPoints = sumPoints(boolsForPoints.get(0),boolsForPoints.get(1),boolsForPoints.get(2),boolsForPoints.get(3));
        float avgChlidPoints = 0;
        var chlidren = new DB().getChildren();
        for(Child child : chlidren.values()){
            avgChlidPoints = avgChlidPoints + sumPoints(child.getHasSibling(),child.getIsImpaired(),child.getIsTwin(),child.getParent().getIsWorking());
        }
        avgChlidPoints = avgChlidPoints/chlidren.size();
        if (sumOfPoints == 0){
            return "Детето има 0 бонус точки и най-вероятно няма да се класира";
        }
        if(sumOfPoints > 0 && sumOfPoints< avgChlidPoints){
            return "Детето ви има малък шанс да се класира";
        }
        if(sumOfPoints == avgChlidPoints){
            return "Детето ви има среден брой точки и ще се класира на случаен принцип";
        }
        if(sumOfPoints > avgChlidPoints && sumOfPoints != 5){
            return "Детето ви има висок шанс да се класира";
        }
        if(sumOfPoints == 5){
            return"Детето ви има максимален брой точки и ще бъде класирано";
        }
        return "Грешка при изчисляването на точките";
    }




    public static int sumPoints(boolean b1, boolean b2, boolean b3,boolean b4) {
        boolean[] myBooleans = {b1, b2, b3,b4};
        int sum = 0;

        for (int i = 0; i < myBooleans.length; i++) {
            if (myBooleans[i]) {
                if (i == 1 && b2) {
                    sum += 2;
                } else {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
