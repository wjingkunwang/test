package innerClass;

/**
 * 在任意作用域类嵌入一个内部类
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {//if不是说TrackingSlip创建是有条件的,它和其他类一起编译通过
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("123");
            String s = ts.getSlip();
            System.out.println(s);
        }
        //不能在这里使用TrackingSlip,超出scope
        /*TrackingSlip ts = new TrackingSlip("123");
        String s = ts.getSlip();
        System.out.println(s);*/
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
