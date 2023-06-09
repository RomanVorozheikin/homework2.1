package ru.roman;

public class Hufflepuff extends Hogwarts {
    private  int hardworking;
    private  int loyal;
    private  int honest;

    public Hufflepuff(String name,int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name,conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    @Override
    public String toString() {
        return "Имя: " + getName() + ", мощность магии: " + getConjure() + ", расстояние трансгрессии: " + getTransgress() +", Трудолюбивость: "+getHardworking()+", Верность: "+getLoyal()+", Честность: "+getHonest();
    }

    public void equalsStudentHufflepuff(Hufflepuff hufflepuff) {
        if (hufflepuff != null) {
            int hufflepuffPoints1=hardworking+loyal+honest;
            int hufflepuffPoints2 = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();

            if (hufflepuffPoints1 > hufflepuffPoints2) {
                System.out.printf("%s, лучший пуффендуец, чем %s\n", getName(),hufflepuff.getName());
            } else if (hufflepuffPoints1 < hufflepuffPoints2) {
                System.out.printf("%s, лучший пуффендуец, чем %s\n", hufflepuff.getName(),getName());
            }else {
                System.out.println("Одинаковые пуффендуйцы");
            }
        }
    }
}
