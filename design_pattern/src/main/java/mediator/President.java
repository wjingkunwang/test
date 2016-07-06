package mediator;

import lombok.Setter;

@Setter
public class President implements Mediator {

    private Financial financial;
    private Market market;
    private Development development;

    public void command(Department department) {
        department.selfAction();
    }
}
