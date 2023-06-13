package game;

public class NumberFormatExceptionError extends NumberFormatException{

    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
