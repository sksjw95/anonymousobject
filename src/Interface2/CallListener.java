package Interface2;

public class CallListener implements Button.OnClickListener {
    @Override
    public void  onClick(){
        System.out.println("전화 call");
    }
}
