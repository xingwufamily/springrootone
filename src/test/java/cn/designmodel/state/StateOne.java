package cn.designmodel.state;

public class StateOne implements State {
    private String value ="stateOne";
    @Override
    public void next(ManagerState managerState) {
        managerState.setState(new StateTwo());
    }
    public String getValue(){
        return value;
    }
}
