package chainOfResponsibility;

/**
 * Created by wjk on 16/7/5.
 */
public class DirectorHandler implements Handler {
    private Handler nextHandler;

    public void handLeave(LeaveNote leaveNote) {
        System.out.println("主管同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天,原因:"+leaveNote.getLeaveReason());
        nextHandler.handLeave(leaveNote);
    }

    public void setNextHandler(Handler h) {
        nextHandler = h;
    }
}
