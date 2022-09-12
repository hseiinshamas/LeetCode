class Solution {

    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        int score = 0;
        while (i <= j) {
            if (tokens[i] <= P) {
                score++;
                P -= tokens[i++];
            } else if (score >= 1 && i < j) {
                score--;
                P += tokens[j--];
            } else break;
        }
        return score;
    }
}
