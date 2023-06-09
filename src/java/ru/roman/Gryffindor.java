package ru.roman;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", мощность магии: " + getConjure() + ", расстояние трансгрессии: " + getTransgress() + ", благородство: " + getNobility() + ", честь: " + getHonor() + ", храбрость: " + getBravery();
    }

    public void equalsStudentGryffindor(Gryffindor otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = nobility + honor + bravery;
            int otherStudentPoints = otherStudent.getNobility() + otherStudent.getHonor() + otherStudent.getBravery();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший грифиндорец, чем %s\n", getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший грифиндорец, чем %s\n", otherStudent.getName(), getName());
            } else System.out.println("Одинаковые грифиндорцы");
        }
    }
}

