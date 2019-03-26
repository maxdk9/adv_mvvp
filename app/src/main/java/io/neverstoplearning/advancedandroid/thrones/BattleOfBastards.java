package io.neverstoplearning.advancedandroid.thrones;

public class BattleOfBastards {
    public static void main(String [] args){
        BattleComponent component=DaggerBattleComponent.create();
        War war1=component.getWar();
        war1.prepare();
        war1.report();
        component.getCash();
        component.getSoldiers();
    }



}
