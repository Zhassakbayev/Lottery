import java.util.ArrayList;


public class Ticket {
    private static int counter = 1;
    private int serialNumber;
    private ArrayList<PlayNumber> playingField;

    public Ticket(ArrayList<PlayNumber> playingField){
        this.serialNumber = counter++;
        this.playingField = playingField;
    }

    public int getSerialNumber() {
        return serialNumber;
    }



    public ArrayList<PlayNumber> getPlayingField() {
        return playingField;
    }

    public int countMatchedNumbersInTicket(){
        int matchedNumbers = 0;
        for (PlayNumber playNumber : getPlayingField()){
            if (playNumber.isPlay()){
                matchedNumbers++;
            }
        }
        return matchedNumbers;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "serialNumber=" + serialNumber +
                ", playingField=" + playingField +
                '}';
    }
}
