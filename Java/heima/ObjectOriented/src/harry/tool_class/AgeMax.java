package harry.tool_class;

import java.util.ArrayList;
import java.util.List;

public class AgeMax {
    private AgeMax() {}

    public static int getMaxAge(List<Student> list) {
        int max = list.get(0).getAge();

        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            max = Math.max(tempAge, max);
        }

        return max;
    }
}
