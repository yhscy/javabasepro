package cc.yhscy.d9_api_stringbuilder;

/**
 * Created by yhsec on 2023/1/2 17:16
 */
public class ArrayUtils {
    private ArrayUtils() {
    }

    public static String arrayOutput(int[] arraylist){
        if (arraylist != null){

            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arraylist.length; i++) {
//            if (i < arraylist.length - 1){
//                int data = arraylist[i];
//                sb.append(data);
//                sb.append(",");
//            }
//            else {
//                sb.append("]");
//            }
                sb.append(arraylist[i]).append(i == arraylist.length - 1 ? "" : ", ");

            }
            sb.append("]");
            return sb.toString();

        }else {
            return null;
        }


    }
}
