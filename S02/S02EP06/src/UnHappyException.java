public class UnHappyException extends  Exception {


    public UnHappyException(){

    }

    public UnHappyException(String msg){
        super(msg + "我不高兴");
    }
}
