package cc.yhscy.d5_fanxclass;

import java.util.ArrayList;

/**
 * Created by yhsec on 2023/2/11 14:49
 */
public class MyArrayList<T> {
    //装饰模式
    private ArrayList arrayList = new ArrayList();

    public void add(T e){
        arrayList.add(e);

    }

    public void remove(T e){
        arrayList.add(e);

    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
