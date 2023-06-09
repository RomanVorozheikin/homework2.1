package ru.roman;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name,int conjure, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
    @Override
    public String toString() {
        return "Имя: " + getName() + ", мощность магии: " + getConjure() + ", расстояние трансгрессии: " + getTransgress() +", Хитрость: "+getCunning()+", Решительность: "+getDetermination()+", Амбициозность: "+getAmbition()+", Находчивость "+getResourcefulness()+", Жажда власти "+getThirstForPower();
    }

    public void equalsStudentsSlytherin(Slytherin slytherin1) {
        if (slytherin1 != null) {
            int slytherinPoints=cunning+determination+ambition+resourcefulness+thirstForPower;
            int slytherinPoints2 = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getThirstForPower();

            if (slytherinPoints > slytherinPoints2) {
                System.out.printf("%s, лучший слезаринец, чем %s\n",getName(),slytherin1.getName());
            } else if (slytherinPoints < slytherinPoints2) {
                System.out.printf("%s, лучший слезаринец, чем %s\n",slytherin1.getName(),getName());
            }else {
                System.out.println("Одинаковые слизеринцы");
            }
        }
    }
}
