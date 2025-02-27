import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> list = initList();
        System.out.println(qwe(list));
    }

    public static List<String> initList() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("ghi");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("mno");
        list.add("pqr");
        list.add("tuv");
        list.add("tuv");
        return list;
    }

    public static List<String> qwe(List<String> list) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                resultList.add(entry.getKey());
            }

        }
        return resultList;
    }
}