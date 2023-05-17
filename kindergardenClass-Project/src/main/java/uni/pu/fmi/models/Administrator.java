package uni.pu.fmi.models;

import java.util.ArrayList;

/**
 * 
 */
public class Administrator {

    /**
     * Default constructor
     */
    public Administrator() {
    }

    /**
     * 
     */
    private Child Child;

    ArrayList<Boolean> boolsForPoints = new ArrayList<>();

    public ArrayList<Boolean> getBoolsForPoints() {return this.boolsForPoints;}
    public void setBoolsForPoints(boolean b1) {this.boolsForPoints.add(b1);}

    /**
     * @param Child
     */
    public void CalculatePoints(Child Child) {
        // TODO implement here
    }

    /**
     * @param Child
     */
    public void ClassChild(Child Child) {
        // TODO implement here
    }

}