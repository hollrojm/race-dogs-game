package co.com.sofkau.dogsgame.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public final class PlayerId extends Identity {
    public PlayerId() {
    }

    public PlayerId(String id) {
        super(id);
    }
    public static PlayerId of(String id){
        return new PlayerId(id);
    }

}
