package uni.pu.fmi.child;

import uni.pu.fmi.controllers.ChildController;
import uni.pu.fmi.models.Parent;

public class ChildPageModel {
    private Boolean isImapaired;
    private Boolean isTwin;
    private Boolean hasSibling;
    private Parent parent;
    private String message;

    public Boolean getIsImpaired(){return isImapaired;}

    public void setIsImapaired(Boolean isImapaired) {this.isImapaired = isImapaired;}
    public Boolean getIsTwin(){return isTwin;};
    public void setIsTwin(Boolean isTwin){this.isTwin = isTwin;}

    public Boolean getHasSibling(){return hasSibling;}
    public void setHasSibling(Boolean hasSibling){this.hasSibling = hasSibling;}

    public Parent getParent(){return parent;}

    public void setParent(Parent parent){this.parent = parent;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void clickButton(){
        ChildController childController = new ChildController();
        message = childController.registerChild(isImapaired,isTwin,hasSibling,parent);
    }
}
