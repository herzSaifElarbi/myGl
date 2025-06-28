package FullExemples.Exemple2;

public class FileDecorator implements IFile{
    private IFile decoratedFile;
    public FileDecorator(IFile decoratedFile){
        this.decoratedFile = decoratedFile;
    }
    @Override
    public String render(){
        return decoratedFile.render();
    }
}
