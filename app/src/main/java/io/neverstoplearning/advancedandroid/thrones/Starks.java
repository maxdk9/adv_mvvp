package io.neverstoplearning.advancedandroid.thrones;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks(){

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
