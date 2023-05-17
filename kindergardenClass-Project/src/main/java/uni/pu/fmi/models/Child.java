package uni.pu.fmi.models;

/**
 * 
 */
public class Child {

    /**
     * Default constructor
     */
    public Child() {
    }

    /**
     * 
     */
    private boolean IsImpaired;

    /**
     * 
     */
    private boolean IsTwin;

    /**
     * 
     */
    private boolean HasSibling;

    /**
     * 
     */
    private int Points;

    /**
     * 
     */
    private Parent Parent;

    /**
     * @return
     */
    public boolean getIsImpaired() {
        return this.IsImpaired;
    }

    /**
     * @param IsImpaired
     */
    public void setIsImpaired(boolean IsImpaired) { this.IsImpaired = IsImpaired;}
        // TODO implement here


    /**
     * @return
     */
    public boolean getIsTwin() {
        return this.IsTwin;
    }

    /**
     * @param IsTwin
     */
    public void setIsTwin(boolean IsTwin) { this.IsTwin = IsTwin;}

    /**
     * @return
     */
    public boolean getHasSibling() {
        return this.HasSibling;
    }

    /**
     * @param HasSibling
     */
    public void setHasSibling(boolean HasSibling) {this.HasSibling = HasSibling;}

    /**
     * @return
     */
    public Parent getParent(){
        return this.Parent;
    }

    /**
     * @param Parent
     */
    public void setParent(Parent Parent) {this.Parent = Parent;}

}