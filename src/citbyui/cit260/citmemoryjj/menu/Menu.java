package citbyui.cit260.citmemoryjj.menu;

import citbyui.cit260.citmemoryjj.interfaces.DisplayInfo;
import citbyui.cit260.citmemoryjj.interfaces.EnterInfo;

public class Menu implements DisplayInfo, EnterInfo {
    
    private String[][] menuItems = null;
    
    public Menu() {
    }
    
    public void displayClassName() {
        System.out.println("Class name: Menu");
    }
    
    @Override
    public void displayStuff() {
        System.out.println("This should work.");
    }
    
    @Override
    public void getUserInput() {
        System.out.println("This should also work.");
    }
}
