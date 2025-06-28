package Behavioral.Iterator.exp1;

public class App {
    public static void main(String[] args) {
        NumbCollection numbCollection = new NumbCollection();
        NumbIterator numbIterator = numbCollection.createIterator();
        while (numbIterator.hasMore()) { 
            System.out.println(numbIterator.getNext());
        }
    }
}
