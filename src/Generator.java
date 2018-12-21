import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Generator {

    public ArrayList<PlayNumber> createNumbers(int maxValue){
        ArrayList<PlayNumber> playNumbers = new ArrayList<>();
        for (int i = 1; i <= maxValue; i++) {
            PlayNumber playNumber = new PlayNumber(i, false);
            playNumbers.add(playNumber);
        }

        return playNumbers;
    }

    public Ticket tickets(ArrayList<PlayNumber> playNumbers, int maxNumbersInTicket){
        Set<PlayNumber> setPlayNumbersForTicket = new HashSet<>();
        int countNumbersInTicket = 0;
        Random random = new Random();
        while (countNumbersInTicket < maxNumbersInTicket) {
            int number = random.nextInt(playNumbers.size());
           setPlayNumbersForTicket.add(playNumbers.get(number));
           countNumbersInTicket=setPlayNumbersForTicket.size();
        }
        ArrayList<PlayNumber> playNumberArrayList = new ArrayList<>(setPlayNumbersForTicket);
        Ticket ticket = new Ticket(playNumberArrayList);
        return ticket;
    }
}
