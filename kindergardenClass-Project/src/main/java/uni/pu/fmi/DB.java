package uni.pu.fmi;

import uni.pu.fmi.models.Child;
import uni.pu.fmi.models.Parent;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private Map<String, Parent> parents = new HashMap<>();
    private Map<String, Child> children = new HashMap<>();


    public DB(){

        Parent parent1 = new Parent();
        parent1.setIsWorking(false);

        Parent parent2 = new Parent();
        parent2.setIsWorking(true);

        parents.put("Georgi", parent1);
        parents.put("Ivan", parent2);


        Child child1 = new Child();
        child1.setIsImpaired(false);
        child1.setHasSibling(true);
        child1.setParent(parent1);
        child1.setIsTwin(false);

        Child child2 = new Child();
        child2.setIsImpaired(true);
        child2.setHasSibling(true);
        child2.setParent(parent2);
        child2.setIsTwin(true);

        children.put("Joro", child1);
        children.put("Pesho", child2);

    }

    public Map<String, Parent> getParents() {
        return parents;
    }

    public Map<String, Child> getChildren() {return children;}
}
