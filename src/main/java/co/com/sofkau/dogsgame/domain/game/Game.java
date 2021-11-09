package co.com.sofkau.dogsgame.domain.game;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.dogsgame.domain.game.events.GameCreated;
import co.com.sofkau.dogsgame.domain.game.values.GameId;
import co.com.sofkau.dogsgame.domain.game.values.Podium;

import java.util.Objects;

public class Game extends AggregateEvent<GameId> {

    protected Podium podium;
    protected Track track;
    protected Player player;


    public Game(GameId gameId, Podium podium, Track track, Player player ) {
        super(gameId);
        Objects.requireNonNull(gameId);
        Objects.requireNonNull(podium);
        Objects.requireNonNull(track);
        Objects.requireNonNull(player);
        appendChange(new GameCreated(gameId, podium, track, player));
    }
}
