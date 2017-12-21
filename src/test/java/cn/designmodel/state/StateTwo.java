package cn.designmodel.state;

public class StateTwo implements State {
    private String value="stateTwo";
    @Override
    public void next(ManagerState managerState) {
        managerState.setState(new StateOne());
    }
    public String getValue(){
        return value;
    }
}
