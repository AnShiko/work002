package com.geekbrains.work002;


public class Robot implements Moving {

    private String name;
    private int runLimit;
    private int jumpLimit;


    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(int lengthOfRunningTrack) {
        if (this.runLimit >= lengthOfRunningTrack)
            System.out.println(name + " пробежал " + 250 + " м., преодолев дитсанцию полностью, пройдя данный этап соревнования. ");
        else
            System.out.println(name + " пробежал только " + runLimit + " м., и на этом покидает соревнование. ");

    }


    public void jump(int heightOfWall, int lengthOfRunningTrack) {
        if(runLimit<lengthOfRunningTrack)
            return;
        if (jumpLimit >= heightOfWall)
            System.out.println(name + " подпрыгнул на " + 50 + " м., и смог преодолеть стену, сдав норматив. ");
        else
            System.out.println(name + " не умеет прыгать. По-этому он просто прошел через стену. За что дисквалифицирован и покидает соревнование. ");

    }


}


