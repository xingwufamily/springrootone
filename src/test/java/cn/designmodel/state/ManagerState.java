package cn.designmodel.state;

public class ManagerState {
    private State state ;

    public ManagerState(){
        this.state = new StateOne();
    }

    public void changeState(){
        state.next(this);
        System.err.println("当前状态是:"+state.getValue());
    }

    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return this.state;
    }
}
