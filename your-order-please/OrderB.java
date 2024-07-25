public class OrderB {
    public static String orderB(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split("\\s+");
        String[] orderedArray = new String[wordsArray.length];

        for (String word : wordsArray) {
            // Kelimedeki numarayı bulun
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int position = Character.getNumericValue(c);
                    // Kelimeyi doğru pozisyona yerleştirin (sıfır tabanlı indeksleme için 1 çıkarın)
                    orderedArray[position - 1] = word;
                    break;
                }
            }
        }

        return String.join(" ", orderedArray);
    }
}
