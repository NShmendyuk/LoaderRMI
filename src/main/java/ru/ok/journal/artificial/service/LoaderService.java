package ru.ok.journal.artificial.service;

import ru.ok.journal.artificial.IArtificialLoader;

import java.util.Scanner;

public class LoaderService extends Thread{

    Scanner sc;
    IArtificialLoader loader;
    String command;

    public LoaderService(String name, IArtificialLoader loader, String command) {
        super(name);
        this.loader = loader;
        this.command = command;
        sc = new Scanner(System.in);
    }

    private void startLoad(){
        System.out.println("started adding comments");
        loader.startLoader();
    }

    private void stopLoad(){
        loader.stopLoader();
        System.out.println("stopped");
    }

    @Override
    public void run() {
        try{
            if (command.equals("start")) {
                System.out.println(" :started");
                startLoad();
                System.out.println("thread stopped");
            }
            else if (command.equals("stop")){
                Thread.sleep(2000);
                System.out.println(" :stopped");
                stopLoad();
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
}