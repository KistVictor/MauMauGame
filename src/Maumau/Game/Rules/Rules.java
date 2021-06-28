/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maumau.Game.Rules;

import Maumau.Game.Game;

/**
 *
 * @author eduardobastos
 */
public class Rules {

    public Integer verifyRules(Game game) {
        CardEffectRules rule = new AceEffectRule( // Verifica todos os efeitos de cartas
                new JackEffectRule(
                        new NineEffectRule(
                                new SevenEffectRule(
                                        new NoEffectRule()))));
        return rule.validate(game);
    }
}
