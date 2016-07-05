package memento;

/**
 * Created by wjk on 16/7/4.
 */
public interface Command {
    void execute();

    void undo(Memento m);

    void redo(Memento m);

    Memento createMemento();

}
