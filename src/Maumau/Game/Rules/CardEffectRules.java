package Maumau.Game.Rules;

import Maumau.Game.Game;

public abstract class CardEffectRules {

    protected CardEffectRules next;

    public CardEffectRules(CardEffectRules next) {
        this.next = next;
    }

    public abstract Integer validate(Game game);
}
