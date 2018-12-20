package chapter07.item45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardExample {

    private static class Card {
        private Suit suit;
        private Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "suit=" + suit +
                    ", rank=" + rank +
                    '}';
        }
    }

    private enum Suit { DIAMOND }
    private enum Rank { TWO }

    public static void main(String[] args) {

        System.out.println(newDeck());
    }

    private static List<Card> newDeck() {
        return Arrays.stream(Suit.values())
                .flatMap(suit ->
                        Arrays.stream(Rank.values())
                .map(rank -> new Card(suit, rank)))
                .collect(Collectors.toList());
    }
}
