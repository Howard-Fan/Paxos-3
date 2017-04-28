import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hyh608 on 4/28/17.
 */
public class myprogram {
    public static void main(String[] args) {
        String input = args[0];
        for(String s : translate(input)) {
            System.out.println(s);
        }
    }

    private static List<String> translate(String input) {
        Queue<String> list = new LinkedList<>();
        List<String> result = new ArrayList<>();
        list.add(input);
        while(!list.isEmpty()) {
            String s = list.poll();
            int index = s.indexOf("X");
            if(index == -1) {
                result.add(s);
            } else {
                list.add(new StringBuilder(s.substring(0, index)).append("0").append(s.substring(index+1, s.length())).toString());
                list.add(new StringBuilder(s.substring(0, index)).append("1").append(s.substring(index+1, s.length())).toString());
            }
        }
        return result;
    }
}
