package cc.yhscy.d7_fanxInterface;

/**
 * Created by yhsec on 2023/2/11 16:24
 */
public interface PeopleData<E> {
    void add(E e);
    void delete(E e);
    void update(E e);
    void query(E e);
}
