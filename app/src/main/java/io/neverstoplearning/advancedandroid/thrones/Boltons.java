package io.neverstoplearning.advancedandroid.thrones;

import javax.inject.Inject;

public class Boltons implements House {
    @Inject
    public Boltons(){

    }


    @Override
    public void PrepareToWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void ReportToWar() {
        System.out.println(this.getClass().getSimpleName()+" reported for war");
    }
}
