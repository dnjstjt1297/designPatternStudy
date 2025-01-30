package singletonTest.problem;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("티켓생성기 생성");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
