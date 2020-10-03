/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:9:45
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addIndex(0,12);
        myArrayList.addIndex(1,14);
        myArrayList.addIndex(2,18);
        myArrayList.addIndex(3,99);
        myArrayList.display();
        myArrayList.del(99);
        myArrayList.display();
    }
}
