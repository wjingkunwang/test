package innerClass;

import innerClass.innerup.Destination;

/**
 * destination() 方法中定义了内部类PDestination,并不意味着一旦destination()方法
 * 执行完后,PDestination就不可用
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }

        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("123");
    }
}
