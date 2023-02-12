package cc.yhscy.d4_collection_list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yhsec on 2023/2/11 22:32
 */
public class Demo2 {
    //LinkedList独有api
    public static void main(String[] args) {
        //创建一个队列(叫号系统)
        LinkedList<String> queue = new LinkedList<>();
//        list.addFirst("1");
//        list.addFirst("2");
//        list.addFirst("3");
//        System.out.println(list); //[3, 2, 1]
//
        //入列(offLast)
        queue.addLast("3");
        queue.addLast("2");
        queue.addLast("1");
        System.out.println(queue);

        //出列()
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //2 .创建一个栈
        LinkedList<String> Stack = new LinkedList<>();
        //入栈（push）
        Stack.addFirst("第一棵树");
        Stack.addFirst("第二棵树");
        Stack.addFirst("第三棵树");
        System.out.println(Stack);

        //出栈(pop)
        System.out.println(Stack.removeFirst());
        System.out.println(Stack.removeFirst());
        System.out.println(Stack); //第一棵树

    }
}
