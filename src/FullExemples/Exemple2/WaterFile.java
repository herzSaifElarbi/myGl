package FullExemples.Exemple2;

public class WaterFile extends FileDecorator{
    public WaterFile(IFile file){
        super(file);
    }
    @Override
    public String render(){
        return super.render()+ "[WATER MARCKED]";
    }
}
