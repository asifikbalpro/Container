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

    public static Vector<Integer>vector = new Vector<>();
    public Vector<Integer> getVector() { // this is the function that i'm not sure about what's happing.
        Vector<Integer>count = new Vector<>();
        for (int i = 0; i < _list.size(); i++){
            int c = _list.elementAt(i);
            if (c >= count.size()){
                count.ensureCapacity(c+1); //this line have problem
            }
            count.elementAt(c); // this line have problem
        }
        return count;
    }
}
