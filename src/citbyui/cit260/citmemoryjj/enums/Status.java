/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.citmemoryjj.enums;

/**
 *
 * @author Family
 */
public enum Status {
    NEW_GAME ("NEW_GAME"),
    CONTINUE ("CONTINUE"),
    PLAYING ("PLAYING"),
    WIN ("WIN"), 
    QUIT ("QUIT"),
    ERROR ("ERROR"),
    EXIT ("EXIT");
    
    String value;
    
    Status(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
