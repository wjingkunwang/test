package builder;

/**
 * Created by wjk on 16/3/16.
 */

// 工人接口，定义了各个工人所要进行的工所作。他们负责进行具体部件如窗户，地板的建造。
// 同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
public interface Builder {
    void makeWindow();
    void makeFloor();
    Room getRoom();
}
