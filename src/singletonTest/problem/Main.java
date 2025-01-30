package singletonTest.problem;

public class Main {
    public static void main(String[] args) {
        TicketMaker t = TicketMaker.getInstance();
        System.out.println(t.getNextTicketNumber());
        System.out.println(t.getNextTicketNumber());
    }
}
