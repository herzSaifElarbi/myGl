package Behavioral.Iterator.exp1;

public class NumbIterator implements IIterator{
    private int index;
    private NumbCollection collection;
    public NumbIterator(NumbCollection collection){
        this.index = 0;
        this.collection = collection;
    }
    
    @Override
    public int getNext(){
        return collection.getItems()[index++];
    }
    @Override
    public boolean hasMore(){
        return index < collection.getItems().length;
    }
}
