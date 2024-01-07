public class Bio {
    public String dnaToRna(String dna) {
            StringBuilder newRna = new StringBuilder();

            for (int i = 0; i < dna.length(); i++) {
                char currentChar = dna.charAt(i);

                if (currentChar == 'T') {
                    newRna.append('U');
                } else {
                    newRna.append(currentChar);
                }
            }

            String resultRna = newRna.toString();
            System.out.println(resultRna);

            return resultRna;
        }
    }
