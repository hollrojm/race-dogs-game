package co.com.sofkau.dogsgame.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class TrackDistance implements ValueObject<String> {

    private final String value;

    public TrackDistance(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La distancia de la pista no puede estar vacía");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
