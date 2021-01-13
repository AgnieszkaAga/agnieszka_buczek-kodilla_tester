public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[6];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "horse";
        animals[3] = "fish";
        animals[4] = "cow";
        animals[5] = "butterfly";

        String animal = animals[3];

        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera "+ numberOfElements + " elementów.");
    }
}
