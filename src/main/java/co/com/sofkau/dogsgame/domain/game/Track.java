package co.com.sofkau.dogsgame.domain.game;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.dogsgame.domain.game.values.TrackDistance;
import co.com.sofkau.dogsgame.domain.game.values.TrackId;


public final class Track extends Entity<TrackId> {

    TrackDistance trackDistance;

    public Track(TrackId trackId, TrackDistance trackDistance) {
        super(trackId);
        this.trackDistance = trackDistance;
    }
}
