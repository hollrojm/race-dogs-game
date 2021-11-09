package co.com.sofkau.dogsgame.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.dogsgame.domain.game.Player;
import co.com.sofkau.dogsgame.domain.game.Track;
import co.com.sofkau.dogsgame.domain.game.values.GameId;
import co.com.sofkau.dogsgame.domain.game.values.Podium;

public final class GameCreated extends DomainEvent {

    private GameId gameId;
    protected Podium podium;
    protected Track track;
    protected Player player;

    public GameCreated(GameId gameId, Podium podium, Track track, Player player) {
        super("dogsgame.game.addedGame");
        this.gameId = gameId;
        this.podium = podium;
        this.track = track;
        this.player = player;
    }

    public GameId getGameId() {
        return gameId;
    }

    public void setGameId(GameId gameId) {
        this.gameId = gameId;
    }

    public Podium getPodium() {
        return podium;
    }

    public void setPodium(Podium podium) {
        this.podium = podium;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
