import java.util.*;

public class Wheel {
    private Set<PlayNumber> notPlayedNumbers;

    public Wheel(ArrayList<PlayNumber> playNumberArrayList) {
        this.notPlayedNumbers = new HashSet<>(playNumberArrayList);
    }

    public Set<PlayNumber> getNotPlayedNumbers() {
        return notPlayedNumbers;
    }

    public PlayNumber turnWheel() {
        PlayNumber playNumber = getRandomPlayNumber();
        playNumber.setPlay(true);
        removePlayedNumber(playNumber);
        return playNumber;
    }

    public PlayNumber getRandomPlayNumber() {
        Iterator<PlayNumber> iterator = notPlayedNumbers.iterator();
        return iterator.next();
    }

    public void removePlayedNumber(PlayNumber playNumber) {
        notPlayedNumbers.remove(playNumber);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "notPlayedNumbers=" + notPlayedNumbers +
                '}';
    }
}
