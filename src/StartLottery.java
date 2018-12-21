import java.util.List;

public class StartLottery {

    public static void startLottery(List<Ticket> tickets, Wheel wheel){
        boolean stopGame = false;
        while(!stopGame){
            for (Ticket ticket : tickets){
                if (ticket.countMatchedNumbersInTicket()==ticket.getPlayingField().size()){
                    System.out.println("STOP GAME!!!");
                    System.out.println("Ticket number " + ticket.getSerialNumber() + " WON!!!" );
                    stopGame=true;
                    break;
                }
            }
            wheel.turnWheel();
        }
    }
}
