package memento;

/**
 * Created by wjk on 16/7/4.
 */
public interface OperationApi {
    int getResult();
    void add(int num);
    Memento createMemento();
    void setMemento(Memento m);
}
