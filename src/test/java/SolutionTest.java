import org.assertj.core.api.Assertions;
import org.junit.Test;


public class SolutionTest {
    @Test
    public void 테스트_42746() {
        lesson42746.Solution solution = new lesson42746.Solution();
        int[] numbers = {6, 10, 2};
        String answer = "6210";
        Assertions.assertThat(solution.solution(numbers)).isEqualTo(answer);
    }

    @Test
    public void 테스트_1829() {
        lesson1829.Solution solution = new lesson1829.Solution();
//        int m = 6;
//        int n = 4;
//        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
//        int[] answer = {4, 5};
//        Assertions.assertThat(solution.solution(m, n, picture)).isEqualTo(answer);

        int m2 = 13;
        int n2 = 16;
        int[][] picture2 = {{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}, {0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
        int[] answer2 = {12, 120};
        Assertions.assertThat(solution.solution(m2, n2, picture2)).isEqualTo(answer2);
    }

    @Test
    public void 테스트_77484() {
        lesson77484.Solution solution = new lesson77484.Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = {3, 5};
        Assertions.assertThat(solution.solution(lottos, win_nums)).isEqualTo(result);
    }

    @Test
    public void 테스트_77884() {
        lesson77884.Solution solution = new lesson77884.Solution();
        int left = 13;
        int right = 17;
        int result = 43;
        Assertions.assertThat(solution.solution(left, right)).isEqualTo(result);
    }

    @Test
    public void 테스트_76501() {
        lesson76501.Solution solution = new lesson76501.Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int result = 9;
        Assertions.assertThat(solution.solution(absolutes, signs)).isEqualTo(result);
    }

    @Test
    public void 테스트_68935() {
        lesson68935.Solution solution = new lesson68935.Solution();
        int n = 45;
        int result = 7;
        Assertions.assertThat(solution.solution(n)).isEqualTo(result);
    }

    @Test
    public void 테스트_12977() {
        lesson12977.Solution solution = new lesson12977.Solution();
        int[] nums = {1, 2, 3, 4};
        int answer = 1;
        Assertions.assertThat(solution.solution(nums)).isEqualTo(answer);
    }

    @Test
    public void 테스트_72410() {
        lesson72410.Solution solution = new lesson72410.Solution();
        String new_id = "=.=";
        String answer = "aaa";
        Assertions.assertThat(solution.solution(new_id)).isEqualTo(answer);
    }

    @Test
    public void 테스트_70128() {
        lesson70128.Solution solution = new lesson70128.Solution();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3,-1,0,2};
        int result = 3;
        Assertions.assertThat(solution.solution(a,b)).isEqualTo(result);
    }

    @Test
    public void 테스트_43165() {
        lesson43165.Solution solution = new lesson43165.Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int answer = 5;
        Assertions.assertThat(solution.solution(numbers,target)).isEqualTo(answer);
    }

    @Test
    public void 테스트_42626() {
        lesson42626.Solution solution = new lesson42626.Solution();
        int[] s = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 2;
        Assertions.assertThat(solution.solution(s, K)).isEqualTo(answer);
    }

    @Test
    public void 테스트_1845() {
        lesson1845.Solution solution = new lesson1845.Solution();
        int[][] nums = {{3, 1, 2, 3}, {3, 3, 3, 2, 2, 4}, {3, 3, 3, 2, 2, 2}};
        int[] result = {2, 3, 2};
        for (int i = 0; i < nums.length; i++) {
            Assertions.assertThat(solution.solution(nums[i])).isEqualTo(result[i]);
        }
    }

    @Test
    public void 테스트_12973() {
        lesson12973.Solution solution = new lesson12973.Solution();
        String[] s = {"baabaa", "cdcd"};
        int[] result = {1, 0};
        for (int i = 0; i < s.length; i++) {
            Assertions.assertThat(solution.solution(s[i])).isEqualTo(result[i]);
        }
    }

    @Test
    public void 테스트_12899() {
        lesson12899.Solution solution = new lesson12899.Solution();
        int[] n = {1, 2, 3, 4};
        String[] result = {"1", "2", "4", "11"};
        for (int i = 0; i < n.length; i++) {
            Assertions.assertThat(solution.solution(n[i])).isEqualTo(result[i]);
        }
    }


    @Test
    public void 테스트_42892() {
        lesson42892.Solution solution = new lesson42892.Solution();
        int[][] nodeinfo = {{5, 3}, {11, 5}, {13, 3}, {3, 5}, {6, 1}, {1, 3}, {8, 6}, {7, 2}, {2, 2}};
        int[][] result = {{7, 4, 6, 9, 1, 8, 5, 2, 3}, {9, 6, 5, 8, 1, 4, 3, 2, 7}};
        Assertions.assertThat(solution.solution(nodeinfo)).isEqualTo(result);
    }

    @Test
    public void 테스트_42891() {
        lesson42891.Solution solution = new lesson42891.Solution();
        int[] relation = {3, 1, 2};
        long k = 5;
        int result = 1;
        Assertions.assertThat(solution.solution(relation, k)).isEqualTo(result);
    }

    @Test
    public void 테스트_42890() {
        lesson42890.Solution solution = new lesson42890.Solution();
        String[][] relation = {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}};
        int answer = 2;
        Assertions.assertThat(solution.solution(relation)).isEqualTo(answer);
    }

    @Test
    public void 테스트_42889() {
        lesson42889.Solution solution = new lesson42889.Solution();
        int N = 5;
        int[] stage = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = {3, 4, 2, 1, 5};
        Assertions.assertThat(solution.solution(N, stage)).isEqualTo(answer);
    }

    @Test
    public void 테스트_42888() {
        lesson42888.Solution solution = new lesson42888.Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] answer = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        Assertions.assertThat(solution.solution(record)).isEqualTo(answer);
    }

}
