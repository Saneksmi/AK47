package com.company;

public class Main {
    public static void main(String[] args) {
        Ak47 mG1 = new Ak47("burst", true,30);
        Ak47 mG2 = new Ak47("single", true, 11);
        Ak47 mG3 = new Ak47("safety", true, 30);
        mG1.openFire();
        mG2.openFire();
        mG3.openFire();
}

    public static class Ak47 {
        String fireModeSwitch;                      //режим огня: "single", "burst", "safety"
        boolean pullTheTrigger;                     //курок: вкл/выкл
        int magazine;                          //обойма

        public Ak47(String fireModeSwitch, boolean pullTheTrigger, int magazine) {
            this.fireModeSwitch = fireModeSwitch;
            this.pullTheTrigger = pullTheTrigger;
            this.magazine = magazine;
        }

        public void openFire () {

            while (magazine > 0 && pullTheTrigger) {
                if (fireModeSwitch.equals("single")) {
                    System.out.println("БАХ!");
                    magazine--;
                    System.out.println("Патронов осталось: " + magazine);
                } else if (fireModeSwitch.equals("burst")) {
                    System.out.println("ТРА-ТА-ТА-ТА-ТА!");
                    magazine = magazine - 5;
                    System.out.println("Патронов осталось: " + magazine);
                } else if (fireModeSwitch.equals("safety")) {
                    System.out.println("Сними с предохранителя");
                    break;
                }
            }
            if (magazine == 0) {
                System.out.println("Перезарядка...");
                System.out.println("Патронов осталось: " + (magazine + 30));
            }

        }
    }




}

