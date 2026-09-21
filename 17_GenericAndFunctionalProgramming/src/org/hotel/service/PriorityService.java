package org.hotel.service;

import org.hotel.model.Reservation;

import java.util.*;

public class PriorityService {
    private Queue<Reservation> waitingQueue = new LinkedList<>();
    private PriorityQueue<Reservation> priorityQueue = new PriorityQueue<>();
    private Stack<String> actionHistory = new Stack<>();
    private Deque<String> activities = new ArrayDeque<>();

    public void addToQueue(Reservation reservation) {

        waitingQueue.offer(reservation);

    }

    public void addToPriorityQueue(Reservation reservation) {

        priorityQueue.offer(reservation);
    }


    public void addActionHistory(Reservation reservation) {

        actionHistory.push(reservation.getId());

    }

    public void addActivities(Reservation reservation) {

        activities.addLast(reservation.getId());
    }

}
