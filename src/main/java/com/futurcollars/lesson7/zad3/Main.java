package com.futurcollars.lesson7.zad3;

public class Main {
    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller("Jacek ", "Ślepy", 2016);
        System.out.println("Ticket Seller");
        System.out.println(ticketSeller.getName());
        System.out.println(ticketSeller.getSurname());
        System.out.println(ticketSeller.getExperience() + " years");
        System.out.println(ticketSeller.getBaseSalary());
        System.out.println("* * * * * * ");
        System.out.println("Manager");
        Manager manager = new Manager("Marcin", "Kowalczyk", 2005, 500);
        System.out.println(manager.getName());
        System.out.println(manager.getSurname());
        System.out.println(manager.getExperience() + " years");
        System.out.println(manager.getBaseSalary());
        System.out.println(manager.calculateMonthlySalary());

    }
}
