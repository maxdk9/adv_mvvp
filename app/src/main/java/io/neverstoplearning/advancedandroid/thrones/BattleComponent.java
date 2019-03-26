package io.neverstoplearning.advancedandroid.thrones;

import dagger.Component;

@Component(modules = Braavos.class)
public interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
    Cash getCash();
    Soldiers getSoldiers();
}
