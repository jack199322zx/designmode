package proxy;

/**
 * @author ss
 * @date 2018/8/13 18:11
 */
public class IvoryTower implements WizardTower {

    public void enter(Wizard wizard) {
        System.out.println(wizard.toString() + " enter to IvoryTower");
    }

}
