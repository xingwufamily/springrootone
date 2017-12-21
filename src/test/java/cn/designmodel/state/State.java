package cn.designmodel.state;


public interface State {
    String getValue();
    void next(ManagerState managerState);
}
