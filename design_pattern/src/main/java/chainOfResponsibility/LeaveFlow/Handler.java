package chainOfResponsibility.leaveFlow;

/**
 * 请假梳理流程
 */
public interface Handler {
    void handLeave(LeaveNote leaveNote);

    void setNextHandler(Handler h);
}
