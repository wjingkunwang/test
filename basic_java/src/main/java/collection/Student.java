package collection;

/**
 * Created by wjk on 16/1/19.
 */
public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(student.getName() == null || name == null){
                return false;
            }else {
                return  name.equalsIgnoreCase(student.getName());
            }
        }
        return false;
    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return !(name != null ? !name.equals(student.name) : student.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
