package co.com.sofkau.dogsgame.domain.game;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.dogsgame.domain.game.values.GameId;

public class Game extends AggregateEvent<GameId> {


    public Game(GameId entityId) {
        super(entityId);
    }
}
