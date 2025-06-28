package Behavioral.Iterator.exp1;

public class NumbCollection implements ICollection{
    private int[] numbs = {1, 2, 3};
    public int[] getItems(){
        return numbs;
    }
    @Override
    public NumbIterator createIterator(){
        return new NumbIterator(this);
    }
}
