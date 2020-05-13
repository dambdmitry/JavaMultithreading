package com.company;

public class Main {

    public static void main(String[] args) {
        //Создаем 5 потоков.
	    Team teamOne = new Team("№1");
	    Team teamTwo = new Team("№2");
        Team teamThree = new Team("№3");
        Team teamFour = new Team("№4");
        Team teamFive = new Team("№5");

        //Запускаем потоки.
        teamOne.start();
        teamTwo.start();
        teamThree.start();
        teamFour.start();
        teamFive.start();
    }
}
