import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class MainTest {

    @Test
    @DisplayName("threeEntries")
     void threeEntries() {
        List<String> list = Main.initList();
        List<String> list1 = new ArrayList<>();
        list1.add("ghi");
        list1.add("mno");
        list1.add("tuv");

        List<String> result = Main.qwe(list);
        Assertions.assertEquals(list1, result,"Error");
    }
    @Test
    @DisplayName("NoEntries")
     void noEntries() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        List<String> list1 = new ArrayList<>();

        List<String> result = Main.qwe(list);
        Assertions.assertEquals(list1, result,"Error");
    }

}
