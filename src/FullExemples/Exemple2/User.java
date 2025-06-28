package FullExemples.Exemple2;

public class User implements IFileSubscriber{
    private String name;
    private INotificationStrategy str;
    public User(String name, INotificationStrategy str){
        this.name = name;
        this.str = str;
    }
    public void setStrategy(INotificationStrategy str){
        this.str = str;
    }
    @Override
    public void update(IFile f){
        System.out.println(this.name + ":");
        str.send(f.render());
    }
}
