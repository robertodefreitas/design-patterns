package dp.observer.interfaces;

public interface HauptgerichtObserver {
    String getName();
    void setName(String name);
    void benachrichtigungBearbeiten(Hauptgericht hauptgericht);
}
