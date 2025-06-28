package FullExemples.Exemple2;

public class BasicFile implements IFile{
    private String content;
    public BasicFile(String content){
        this.content = content;
    }
    @Override
    public String render(){
        return content;
    }
}
