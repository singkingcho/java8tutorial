public class HumanTest {


    public static void main(String[] args) {

        Human h = new Human();
        // 有点小问题。  不符合实际情况。
//        h.age = -3333;
//         h.height = 33;

        boolean b = h.setHeight(-133);
        if(b){
            System.out.println("身高赋值成功");
            System.out.println(h.getHeight());
        }else{
            System.out.println("身高赋值失败");
        }


    }
}
