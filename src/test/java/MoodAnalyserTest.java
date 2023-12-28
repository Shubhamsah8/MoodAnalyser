import org.example.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {

    @Test
    public void givenHappyMessage_ShouldReturnHappyMessage() throws MoodAnalyser.MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am Happy");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenSadMessage_ShouldReturnSadMessage() throws MoodAnalyser.MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am Sad");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenNeutralMessage_ShouldReturnNeutralMessage() throws MoodAnalyser.MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am okay");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("NEUTRAL", mood);
    }

    @Test
    public void givenNullMessage_ShouldReturnNeutralMessage(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyser.MoodAnalysisException e) {
            Assertions.assertEquals("NULL", e.getMessage());
        }
    }

    @Test
    public void givenEmptyMessage_ShouldReturnNeutralMessage() throws MoodAnalyser.MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("EMPTY", mood);
    }
}
