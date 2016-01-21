package collection;

/**
 * Created by wjk on 16/1/19.
 */
public class SeniorStudent extends Student {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeniorStudent(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SeniorStudent that = (SeniorStudent) o;

        return id == that.id;

    }


    /* @Override
    public boolean equals(Object obj) {
        if (obj instanceof SeniorStudent) {
            SeniorStudent ss = (SeniorStudent) obj;
            return super.equals(obj) && ss.getId() == id;
        }
        return false;
    }*/

}
