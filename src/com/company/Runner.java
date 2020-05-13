package com.company;

import java.util.Random;

//Класс потока бегуна команды.
public class Runner extends Thread {
    private String runnerName; //Имя бегуна.
    private String runnerTeamName; //Имя его команды.
    private int runnerDistance; //Дистанция, которую ему нужно преодолеть

    public Runner(String name, String teamName, int runnerDistance){
        this.runnerName = name;
        this.runnerTeamName = teamName;
        this.runnerDistance = runnerDistance;
    }

    public void run(){
        int rangeDis = 0; //Сколько пробежал.
        Random rnd = new Random();
        while(rangeDis < this.runnerDistance) {
            rangeDis += rnd.nextInt(10);
            System.out.println(this.runnerName + " команды " + this.runnerTeamName + " пробежал " + rangeDis + " м");
            try {
                Runner.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(this.runnerName + " прервался ");
                e.printStackTrace();
            }
        }
    }
}
