import java.util.Vector;

class main {
    public static void main(String[] argc){
//        Container container = new Container(5);
//        container.random();
////        container.Contaian();
//        container.ContainV2();
//        container.view();
//


        Container2 container2 = new Container2();
//        container2.test();
        container2.pushback(10);
        container2.view();

        Vector<Integer> friquncy = container2.getVector();
        for (int i = 0; i < friquncy.size(); i++){
            System.out.println(i +"=|"+ friquncy.elementAt(i));
        }

    }
}
