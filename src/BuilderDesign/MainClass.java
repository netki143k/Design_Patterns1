package BuilderDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student.StudentBuilder("kiran", "30", "jayaraj", "lakshmi")
                .setDob("18-jan-1991")
                .build();

        System.out.println(s1);


        Map<String, List<String>> values = new HashMap<>();
        List<String> l1 = new ArrayList<>();
        l1.add("test1");
        l1.add("test2");

        List<String> l2 = new ArrayList<>();
        l2.add("test3");
        l2.add("test4");
        values.put("1", l1);
        values.put("2", l2);
        List<String> l3 = new ArrayList<>();
        List l4 = values.entrySet().stream().map(o -> o.getValue()).collect(Collectors.toList());
        l3.addAll(l4);
        System.out.println(l3);
    }
}
