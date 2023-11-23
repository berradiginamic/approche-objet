package utiles;

public class StringUtils {

    public static int levenshteinDistance(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return -1; // Valeur indiquant des paramètres invalides
        }

        int len1 = s1.length();
        int len2 = s2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = min(
                            dp[i - 1][j - 1] + costOfSubstitution(s1.charAt(i - 1), s2.charAt(j - 1)),
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1
                    );
                }
            }
        }

        return dp[len1][len2];
    }

    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}