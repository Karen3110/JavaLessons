package com.company.design_patterns.observer;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone();

        // fixme:  pordzel em ashxatelu hamar uxaki
        new Computer(phone1, "Comp 1");
        new Notebook(phone1, "Notebook 1");
        new Computer(phone1, "Comp 2");

        Phone phone2 = new Phone();
        PCElectronics computer4 = new Computer(phone2, "Notebook 2");
        PCElectronics computer5 = new Computer(phone2, "Comp 3");
        PCElectronics computer6 = new Computer(phone2, "Notebook 3");

        phone1.enableWifiHotSpot();
        phone2.enableWifiHotSpot();
    }
}
