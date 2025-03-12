package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( Card otherCard ){
        return otherCard instanceof AnimalCard && this.animal.equals(((AnimalCard) otherCard).animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
