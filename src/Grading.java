public class Grading {
    public static void main(String[] args) {
        int[] scores = {95, 80, -5, 65, 105, 40, -1, 88, 73};

        int validCount = 0;

        for (int score : scores) {
            if (score < 0 || score > 100) {
                if (score == -1) {
                    System.out.println("Instructor ended the evaluation early.");
                    break;
                }

                System.out.println("Invalid score: " + score);
                continue;
            }

            validCount++;

            if (score >= 90) {
                System.out.println("Score: " + score + " - Grade A");
            } else if (score >= 75) {
                System.out.println("Score: " + score + " - Grade B");
            } else if (score >= 50) {
                System.out.println("Score: " + score + " - Grade C");
            } else {
                System.out.println("Score: " + score + " - Grade F");
            }
        }
        System.out.println("\nTotal valid scores processed: " + validCount);
    }
}

