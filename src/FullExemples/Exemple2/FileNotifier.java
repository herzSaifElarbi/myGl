package FullExemples.Exemple2;

import java.util.ArrayList;
import java.util.List;

public class FileNotifier implements IFilePublisher{
    private List<IFileSubscriber> subs;
    public FileNotifier(){
        this.subs = new ArrayList();
    }
    @Override
    public void subscribe(IFileSubscriber s){
        this.subs.add(s);
    }
    @Override
    public void unsubscribe(IFileSubscriber s){
        this.subs.remove(s);
    }
    public void nofifySubs(IFile f){
        for(IFileSubscriber s : subs){
            s.update(f);
        }
    }
}
