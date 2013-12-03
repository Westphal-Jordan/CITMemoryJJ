/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.citmemoryjj.enums;

/**
 *
 * @author Family
 */
public enum WeekTenJordan {
    MONDAY ("No one likes Mondays.");
    
    String value;
    
    WeekTenJordan(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
