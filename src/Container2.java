import java.util.Random;
import java.util.Vector;

class Container2 {
    private Vector<Integer>_list = new Vector<>();

    public void pushback(int a){
        Random random = new Random();
        for (int i = 0; i < a;i++) {
            _list.add(random.nextInt(a));
        }
    }

    public void view(){
        for (int i = 0; i < _list.size();i++){
            System.out.println(_list.elementAt(i));
        }
    }

    public Vector<Integer>vector = new Vector<>();
    public Vector<Integer> getVector() {
        Vector<Integer>count = new Vector<>();
        for (int i = 0; i < _list.size(); i++){
            int c = _list.elementAt(i);
            if (c >= count.size()){
                count.ensureCapacity(c+1);
            }
            count.elementAt(c);
        }
        return count;
    }
}
