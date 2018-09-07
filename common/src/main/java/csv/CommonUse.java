package csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gouzhijun
 * on 2018/5/8
 */
public class CommonUse {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        System.out.println("result : " + list.containsAll(new ArrayList<>()));
    }

}
