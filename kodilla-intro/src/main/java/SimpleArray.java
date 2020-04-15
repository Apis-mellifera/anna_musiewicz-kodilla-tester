public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String [8];  // tablica jednowymiarowa jest obiektem
                animals[0]= "Whale";
                animals[1]= "Shark";
                animals[2]= "Dolphin";
                animals[3]= "Octopus";
                animals[4]= "Elephant";
                animals[5]= "Giraffe";
                animals[6]= "Tiger";
                animals[7]= "Lion";

         String animal = animals[3];  //wyciąganie elemntu z tablicy
        System.out.println(animal);

        int numberOfElements = animals.length;      //metoda lenght
        System.out.println( "My array contains" + " " + animals.length + " " + "elements");






    }
}
