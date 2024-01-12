public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                result.append(firstChar).append(word.substring(1)).append(" ");
            }
        }

        return result.toString().trim();

    }

}