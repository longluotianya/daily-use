package json;

import java.awt.Event;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Created by gouzhijun
 * on 2018/7/26
 */
public class GsonUse {

    private static String name = "gsonUse";
    private String desc = "dsada";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GsonUse.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void primitiveExample() {
        // serializable
        Gson gson = new Gson();
        System.out.println("1 toJson : " + gson.toJson(1));
        System.out.println("abcd toJson : " + gson.toJson("abcd"));
        int[] values = {1};
        System.out.println("array toJson : " + gson.toJson(values));
        System.out.println("empty array toJson : " + gson.toJson(new int[]{}));
        System.out.println("null toJson : " + gson.toJson(null));

        // deserializable
        System.out.println("boolean fromJson : " + gson.fromJson("true", Boolean.class));
        System.out.println("array fromJson : " + Arrays.toString(gson.fromJson("[1,2,3]", Integer[].class)));
        System.out.println("array fromJson : " + Arrays.toString(gson.fromJson("[\"1\",\"2\"]", Long[].class)));
    }

    public void primitiveBagExample() {
        Gson gson = new Gson();
        BagOfPrimitives bag = new BagOfPrimitives();
        String resultGson = gson.toJson(bag);
        System.out.println("result : " + resultGson);
    }

    public void collectionExample() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        Gson gson = new Gson();
        String listJson = gson.toJson(list);
        System.out.println("result : " + listJson);
        List<Integer> parsedList = JSON.parseArray(listJson, Integer.class);
        System.out.println("fastjson : " + parsedList);
        List<Integer> parsedListGson = gson.fromJson(listJson, new TypeToken<List<Integer>>(){}.getType());
        System.out.println("gsonjson : " + parsedListGson);
    }

    public void arbitraryTypes() {
        Gson gson = new Gson();
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add(5);
        collection.add(new Event("GREETINGS", "guest"));
        String json = gson.toJson(collection);
        System.out.println("json : " + json);
        Collection deCollection = gson.fromJson(json, Collection.class);
        System.out.println("deserial: " + deCollection);
    }

    public void staticJson() {
        Gson gson = new Gson();
        GsonUse gsonUse = new GsonUse();
        System.out.println("result : " + gson.toJson(gsonUse));
        System.out.println("fastjson result : " + JSON.toJSONString(gsonUse));
    }


    public static void main(String[] args) {
//        new GsonUse().primitiveExample();
//        new GsonUse().primitiveBagExample();
//        new GsonUse().collectionExample();
//        new GsonUse().arbitraryTypes();
        new GsonUse().staticJson();
    }

    class BagOfPrimitives {
        private int value1 = 1;
        private transient String value2 = "abc";
        private String name = "dsadas";

        private int value3 = 3;

        public int getValue1() {
            return value1;
        }

        public void setValue1(int value1) {
            this.value1 = value1;
        }

        public String getValue2() {
            return value2;
        }

        public void setValue2(String value2) {
            this.value2 = value2;
        }

        public int getValue3() {
            return value3;
        }

        public void setValue3(int value3) {
            this.value3 = value3;
        }


    }

    class Event {
        private String name;
        private String source;
        private Event(String name, String source) {
            this.name = name;
            this.source = source;
        }
    }
}
