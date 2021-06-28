package Maumau.Game.Rules;

import Maumau.Cards.Card;
import Maumau.Cards.Face;
import Maumau.Cards.Suit;
import Maumau.Game.Game;
import java.util.Scanner;

public class JackEffectRule extends CardEffectRules {

    public JackEffectRule(CardEffectRules next) {
        super(next);
    }

    @Override
    public Integer validate(Game game) {
        if (Face.JACK == game.getCardPlayed().getFace()) {  // Verifica se a carta jogada é um valete
            System.out.println("Selecione o naipe desejeado: [0]Paus [1]Ouros [2]Espadas [3]Copas");
            Scanner scanner = new Scanner(System.in);
            Integer suitIndex = scanner.nextInt();
            System.out.println("\n");
            game.setLastCard(new Card(Face.JACK, Suit.getSuit(suitIndex))); // Define o naipe para a próxima carta

            return game.getJ(); // Retorna a posição do jogador para o jogo continuar
        }

        return next.validate(game); // Se não validar, passa para a próxima regra de validação
    }

}
