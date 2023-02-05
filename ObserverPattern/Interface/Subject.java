package ObserverPattern.Interface;

public interface Subject {
    public void registerObservable(Observer o);
    public void removeObservable(Observer o);
    public void notifyObservable();
}