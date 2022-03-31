package dp.observer.interfaces;

public interface HauptgerichtObserver {
    String getName();
    void setName(String name);
    void hauptgerichtIstFertig(Hauptgericht hauptgericht);
}
