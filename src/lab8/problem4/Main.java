package lab8.problem4;

public class Main {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.addTicket("train");
        ticketingSystem.addTicket("airplane");
        ticketingSystem.addTicket("bus");
        System.out.println(ticketingSystem);
        ticketingSystem.processTicket();
        System.out.println(ticketingSystem);
        System.out.println(ticketingSystem.viewNextTicket());
    }
}
