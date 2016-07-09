package observer.job;

/**
 * Created by wjk on 16/7/9.
 */
public class ConcreteSeeker implements JobSeeker {
    private String name;

    public ConcreteSeeker(String name) {
        this.name = name;
    }

    public void update(Headhunter headhunter) {
        headhunter.haveAJob();
    }

    public boolean getJobMessage() {
        return false;
    }
}
