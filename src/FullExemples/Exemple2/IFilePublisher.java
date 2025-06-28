package FullExemples.Exemple2;

public interface IFilePublisher {
    void subscribe(IFileSubscriber s);
    void unsubscribe(IFileSubscriber s);
    void nofifySubs(IFile f);
}
