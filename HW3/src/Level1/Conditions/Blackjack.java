package Level1.Conditions;

import java.util.Scanner;

public class Blackjack {
    static int blackjackScore(int cardA, int cardB) {
        if (cardA < 1 || cardB < 1) {
            throw new IllegalArgumentException("Error! Wrong card(s) is(are) entered!");
        }

        if (cardA > 21 && cardB > 21) {
            return 0;
        }
        int maxCard = cardA > cardB ? cardA : cardB;
        return maxCard > 21 ? 21 : maxCard;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two cards: ");
        int card1 = sc.nextInt();
        int card2 = sc.nextInt();

        System.out.println("The score is " + blackjackScore(card1, card2) + ".");
    }
}
