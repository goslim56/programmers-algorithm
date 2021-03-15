import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import org.assertj.core.api.Assertions;

public class SolutionTest {

    @Test
    public void 테스트_42889() {
        lesson42889.Solution solution = new lesson42889.Solution();
        int N = 5;
        int[] stage = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = {3,4,2,1,5};
        Assertions.assertThat(solution.solution(N,stage)).isEqualTo(answer);
    }

    @Test
    public void 테스트_42888() {
        lesson42888.Solution solution = new lesson42888.Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        Assertions.assertThat(solution.solution(record)).isEqualTo(answer);
    }

}
