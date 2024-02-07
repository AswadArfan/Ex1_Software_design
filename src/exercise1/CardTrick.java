package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * @modifier AswadArfan (2024-01-31)
 * @modifier Aswad
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            int randomValue = random.nextInt(13) + 1;
            String randomSuit = Card.SUITS[random.nextInt(4)];
            hand[i] = new Card(randomValue, randomSuit);
        }

        System.out.println("Pick a card (Enter value between 1 and 13):");
        int userValue = scanner.nextInt();

        System.out.println("Pick a suit(enter 1 for Hearts, 2 for Diamonds, 3 for Clubs, and 4 for Spades):");
        int userSuit = scanner.nextInt();

        Card userCard = new Card(userValue, Card.SUITS[userSuit - 1]);

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, Your card is not in the hand");
        }
    }
// i am done.
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Aswad Arfan, but you can call me Aswad");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();
        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Travelling");
        System.out.println("-- Watching TV");
        System.out.println("-- Car Modifications");
        System.out.println();
    }
}


