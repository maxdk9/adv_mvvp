package io.neverstoplearning.advancedandroid.thrones;

import javax.inject.Inject;

public class War {
    public Starks starks;
    public Boltons boltons;

    @Inject
    public War(Starks s,Boltons b){
        starks=s;
        boltons=b;
    }


    public void prepare(){
        starks.PrepareToWar();
        boltons.PrepareToWar();
    }

    public void report(){
        starks.ReportToWar();
        boltons.ReportToWar();
    }
}
