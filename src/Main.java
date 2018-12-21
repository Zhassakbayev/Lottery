import java.util.ArrayList;

/*
3739 -the time of creation of tickets (mms)
STOP GAME!!!
Ticket number 59653 WON!!!
337  -  the time of search  first winner (mms)

* */


public class Main {
    public static final int MAX_VALUE = 36;
    public static final int MAX_NUMBERS_IN_TICKET = 6;
    public static final int NUMBERS_OF_PLAYERS=1000000;

    public static void main(String[] args) {
        ArrayList<PlayNumber> playNumbers;
        ArrayList<Ticket> tickets = new ArrayList<>();
        Generator generator = new Generator();
        playNumbers = generator.createNumbers(MAX_VALUE);
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < NUMBERS_OF_PLAYERS; i++) {
            Ticket ticket = generator.tickets(playNumbers, MAX_NUMBERS_IN_TICKET);
            int s = ticket.getSerialNumber();
            tickets.add(ticket);
        }
        long finishTime=System.currentTimeMillis();
        System.out.println(finishTime-startTime);
        Wheel wheel = new Wheel(playNumbers);
        startTime=System.currentTimeMillis();
        StartLottery.startLottery(tickets,wheel);
        finishTime=System.currentTimeMillis();
        System.out.println(finishTime-startTime);
    }
}
