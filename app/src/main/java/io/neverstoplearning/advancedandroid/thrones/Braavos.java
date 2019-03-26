package io.neverstoplearning.advancedandroid.thrones;

import dagger.Module;
import dagger.Provides;

@Module
public class Braavos {
    Cash cash;
    Soldiers soldiers;


    @Provides
    Cash provideCash(){
        return cash;
    }


    @Provides
    Soldiers provideSoldiers(){
        return soldiers;
    }

}
