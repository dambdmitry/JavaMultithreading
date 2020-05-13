package com.company;

//Класс потока отдельной команды.
public class Team extends Thread{
    private String teamName; //Имя команды.
    private Runner runner; //Поток бегуна команды.
    private int distanceForRunner = 100; //Сколько метров нужно пробежать каждому бегуну.
    private int runnerCount = 4; //Сколько в команде бегунов.

    public Team(String name){
        this.teamName = name;
    }

    public void run() {
        for(int i = 1; i <= this.runnerCount; i++){
            String runnerName = "Бегун №" + i;
            runner = new Runner(runnerName, this.teamName, this.distanceForRunner);
            runner.start();
            //Чтобы следующий бегун не побежал, пока не добежит свою дистанцию текущий.
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(runnerName + " команды " + this.teamName + " передал эстофету!!!");
        }
        System.out.println("Команда " + this.teamName + " финишировала!!!");
    }
}
