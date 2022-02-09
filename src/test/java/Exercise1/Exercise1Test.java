package Exercise1;

import Exercise1.Exercise1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class Exercise1Test {

    @Test
    void canCountFrequencyOfObjectUsingHashMapWithOneNumber() {
        // Given

        String initialInput = "1,1,1,1,";

        String[] input = initialInput.split(",");

        HashMap<String, Integer> underTest = new HashMap<>();

        // When

        Exercise1.countStringFrequency(input, underTest);

        // Then
        assertThat(underTest).containsEntry("1", 4);
    }

    @Test
    void canCountFrequencyOfObjectUsingHashMapWithMultipleNumbers() {
        // Given

        String initialInput = "1,1,1,1,2,2,4,4,4,6,6";

        String[] input = initialInput.split(",");

        HashMap<String, Integer> underTest = new HashMap<>();

        // When

        Exercise1.countStringFrequency(input, underTest);


        // Then
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("1",4);
        expected.put("2",2);
        expected.put("4",3);
        expected.put("6",2);
        assertThat(underTest).containsExactlyEntriesOf(expected);
    }
}