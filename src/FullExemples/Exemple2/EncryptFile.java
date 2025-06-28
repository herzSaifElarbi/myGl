package FullExemples.Exemple2;

public class EncryptFile extends FileDecorator{
    public EncryptFile(IFile file) {
        super(file);
    }
    @Override
    public String render(){
        return "[ENCREPTED]" + super.render();
    }
}
