package co.com.sofkau.dogsgame.domain.game;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.dogsgame.domain.game.values.PlayerId;
import co.com.sofkau.dogsgame.domain.game.values.PlayerName;

public final class Player extends Entity<PlayerId> {

    protected PlayerName playerName;

    public Player(PlayerId playerId, PlayerName playerName) {
        super(playerId);
        this.playerName = playerName;
    }
}
