import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

    public static List<Object> filterList(final List<Object> list) {

        List<Object> result = list.stream().filter(lstObj -> lstObj instanceof Integer).collect(Collectors.toList());

        return result;
    }
}
