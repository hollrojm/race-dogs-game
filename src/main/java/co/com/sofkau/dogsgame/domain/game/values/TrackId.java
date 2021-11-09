package co.com.sofkau.dogsgame.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public final class TrackId extends Identity {

    public TrackId() {
    }

    public  TrackId(String id){
        super(id);
    }
    public static TrackId of(String id){
        return new TrackId(id);
    }

}
