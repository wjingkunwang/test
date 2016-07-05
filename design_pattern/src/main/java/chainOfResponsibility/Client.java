package chainOfResponsibility;

/**
 * 模拟请假审批流程:
 * 提出请假申请
 * 主任审批
 * 总经理审批
 * 如果:其中需要一个副总经理审批可在主任审批后的流程添加副总经理审批
 */
public class Client {

    public static void main(String[] args) {
        LeaveNote leaveNote = new LeaveNote("小米","肚子疼",1);
        DirectorHandler directorHandler = new DirectorHandler();
        ViceManagerHandler viceManagerHandler = new ViceManagerHandler();
        ManagerHandler managerHandler = new ManagerHandler();

        directorHandler.setNextHandler(viceManagerHandler);
        viceManagerHandler.setNextHandler(managerHandler);
        directorHandler.handLeave(leaveNote);
    }
}
