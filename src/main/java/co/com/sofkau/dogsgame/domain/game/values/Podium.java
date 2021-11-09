package co.com.sofkau.dogsgame.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

public  class Podium implements ValueObject<Podium.Props> {

    public Podium() {
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public enumPodiums firstPlace() {
                return enumPodiums.FIRST_PLACE;
            }

            @Override
            public enumPodiums SecondPlace() {
                return enumPodiums.SECOND_PLACE;
            }

            @Override
            public enumPodiums thirdPlace() {
                return enumPodiums.THIRD_PLACE;
            }
        };
    }

    public interface Props{
        enumPodiums firstPlace();
        enumPodiums SecondPlace();
        enumPodiums thirdPlace();
    }

    public enum enumPodiums{
        FIRST_PLACE, SECOND_PLACE , THIRD_PLACE;
        }

}

