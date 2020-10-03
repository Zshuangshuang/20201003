/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:9:41
 **/
public class MyArrayList {

    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    public void addIndex(int pos, int val) {
        if (pos < 0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("当前pos位置不合法");
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = val;
        this.usedSize++;
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + "  ");
        }
        System.out.println();
    }

    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public void del(int key){
        int ret = search(key);
        if (ret == -1){
            System.out.println("没有要删除的元素");
            return;
        }
        for (int i = ret; i <= this.usedSize-1 ; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    public int size(){
        return this.elem.length;
    }
    public int getPos(int pos){

        if (this.elem == null){
            throw new RuntimeException("当前顺序表为Null！");
        }
        if (pos<0 || pos>this.usedSize){
            throw new ArrayIndexOutOfBoundsException("当前pos位置不合法！");
        }
        return this.elem[pos];
    }

}