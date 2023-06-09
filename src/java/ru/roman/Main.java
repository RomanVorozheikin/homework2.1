package ru.roman;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Потер", 30, 90, 99, 100, 100),
                new Gryffindor("Гермиона Грейнджер", 20, 70, 68, 10, 20),
                new Gryffindor("Рон Уизли", 40, 60, 79, 20, 70),
        };
        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", 60, 48, 80, 90, 1, 67, 48),
                new Slytherin("Грэхэм Монтегю", 10, 34, 45, 56, 67, 78, 90),
                new Slytherin("Грегори Гойл", 98, 87, 76, 76, 78, 65, 54),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 61, 83, 94, 92, 38),
                new Hufflepuff("Седрик Диггори", 92, 42, 88, 65, 85),
                new Hufflepuff("Джастин Финч-Флетчли", 12, 14, 26, 56, 78),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 10, 29, 38, 48, 58, 78),
                new Ravenclaw("Падма Патил", 34, 67, 54, 38, 28, 65),
                new Ravenclaw("Маркус Белби", 67, 23, 98, 34, 27, 33),
        };
        System.out.println(gryffindors[0]);
        System.out.println(ravenclaws[1]);
        System.out.println(hufflepuffs[2]);

        gryffindors[0].equalsStudentGryffindor(gryffindors[1]);
        slytherin[1].equalsStudentsSlytherin(slytherin[2]);
        hufflepuffs[2].equalsStudentHufflepuff(hufflepuffs[0]);
        ravenclaws[1].equalsStudentRavenclaw(ravenclaws[0]);

        gryffindors[2].equalsStudentHogwarts(hufflepuffs[0]);
    }
}
