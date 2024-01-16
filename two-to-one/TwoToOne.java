import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String combinedString = s1 + s2;

        String result = combinedString.chars().distinct().distinct()
                .sorted().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return result;
    }
}

//combinedString.chars()                            combinedString icindeki karakterlerin IntStream temsilini olusturuyor (unicode degerleri)
//.mapToObj(c -> String.valueOf((char) c))       Stream<String>  olusturuyor.
//.collect(Collectors.joining())                 Stream icindeki tum karakterleri birlestirerek tek bir String olusturuyor.
