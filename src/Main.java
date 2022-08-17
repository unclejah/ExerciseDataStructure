import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("st1");
        strings.add("st2");
        strings.add("st3");
        strings.add("st4");

        strings.add(1, "st5");
        for (String str : strings){
            System.out.println(str);
        }
        System.out.println("//===============================");
        //===============================
        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("st1");
        linkedStrings.add("st2");
        linkedStrings.add("st3");
        linkedStrings.add("st4");

        linkedStrings.add(1, "st5");
        for (String str : linkedStrings){
            System.out.println(str);
        }
        System.out.println("//===============================");
        //===============================
        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
        System.out.println("//===============================");
        //===============================
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 1; i<100;i++){
            Dog dog = new Dog();
            dog.height = i;
            dogs.add(dog);
        }

        DogScaner dogScaner =new DogScaner();
        dogScaner.scanDog(dogs);
        System.out.println("//===============================");
        //===============================
        CustArrayList<String> custStrings = new CustArrayList<>();
        custStrings.add("Custst1");
        custStrings.add("Custst2");
        custStrings.add("Custst3");
        custStrings.add("Custst4");

        custStrings.add(1, "Custst5");
        for (String str : custStrings){
            System.out.println(str);
        }
        System.out.println("//===============================");
//===============================
        CustLinkedList<String> custLinkedStrings = new CustLinkedList<>();
        custLinkedStrings.add("CustLinst1");
        custLinkedStrings.add("CustLinst2");
        custLinkedStrings.add("CustLinst3");
        custLinkedStrings.add("CustLinst4");

        custLinkedStrings.add(2, "CustLinst5");
        for (String str : custLinkedStrings){
            System.out.println(str);
        }
        System.out.println("//===============================");
        //===============================
        //Find in CustList
        System.out.println("find custst5 = "+custStrings.indexOf("Custst5"));
        System.out.println("find  2 = "+custStrings.get(2));
        //Remove FromCustList
        custStrings.remove("Custst3");
        for (String str : custStrings){
            System.out.println(str);
        }
        System.out.println("//===============================");
        //Find in CustList
        System.out.println("find CustLinst5 = "+custLinkedStrings.indexOf("CustLinst5"));
        System.out.println("find 1 = "+custLinkedStrings.get(1));
        //Remove FromCustList
        custLinkedStrings.remove("CustLinst2");
        for (String str : custLinkedStrings){
            System.out.println(str);
        }
    }

}
