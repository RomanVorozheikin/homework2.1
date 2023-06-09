package ru.roman;

import java.util.Arrays;

public class Hogwarts {
    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void equalsStudentHogwarts(Hogwarts hogwarts) {
        int hogwartsStudentPoints1=conjure+transgress;
        int hogwartsStudentPoints2=hogwarts.getConjure()+hogwarts.getTransgress();
        if (hogwartsStudentPoints1 > hogwartsStudentPoints2) {
            System.out.printf("%s по суммарной силе магии и способностям к трансгрессии сильней, чем %s",getName(),hogwarts.getName());
        } else if (hogwartsStudentPoints1 < hogwartsStudentPoints2) {
            System.out.printf("%s по суммарной силе магии и способностям к трансгрессии сильней, чем %s",hogwarts.getName(),getName());
        }else {
            System.out.println("Они равны по суммарной силе магии и способностям к трансгрессии");
        }
    }
}
