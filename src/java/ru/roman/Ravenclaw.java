package ru.roman;

public class Ravenclaw extends Hogwarts {
    private  int smart;
    private  int wise;
    private  int witty;
    private  int creativity;

    public Ravenclaw(String name,int conjure, int transgress, int smart, int wise, int witty, int creativity) {
        super(name,conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    @Override
    public String toString() {
        return "Имя: " + getName() + ", мощность магии: " + getConjure() + ", расстояние трансгрессии: " + getTransgress() +", Ум: "+getSmart()+", Мудрость: "+getWise()+", Остроумие: "+getWitty()+", Творчество: "+getCreativity();
    }

    public void equalsStudentRavenclaw(Ravenclaw ravenclaw) {
        if (ravenclaw != null) {
            int ravenclawPoints1=smart+wise+witty+creativity;
            int ravenclawPoints2=ravenclaw.getSmart()+ravenclaw.getWise()+ravenclaw.getWitty()+ravenclaw.getCreativity();
            if (ravenclawPoints1 > ravenclawPoints2) {
                System.out.printf("%s, лучший когтевранец, чем %s\n",getName(),ravenclaw.getName());
            } else if (ravenclawPoints1 < ravenclawPoints2) {
                System.out.printf("%s, лучший когтевранец, чем %s\n",ravenclaw.getName(),getName());
            }else {
                System.out.println("Одинаковые когтевранцы");
            }
        }
    }
}
