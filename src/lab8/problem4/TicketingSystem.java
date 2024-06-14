package lab8.problem4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description) {
        Ticket ticket = new Ticket(String.format("%04d", nextId), description);
        nextId++;
        ticketQueue.add(ticket);
    }

    public Ticket processTicket() {
        if (nextId == 1)
            return null;
        else {
            nextId--;
            return ticketQueue.remove();
        }

    }

    public Ticket viewNextTicket() {
        return ticketQueue.poll();
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Ticket> iterator = ticketQueue.iterator();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
