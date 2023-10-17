package shared;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputUtils {
    public static String[] readInputsFrom(int day, boolean isSample) {
        try {
            Path inputsFile = Paths.get("", "day" + day, isSample ? "Samples.txt" : "Inputs.txt");
            List<String> lines = Files.readAllLines(inputsFile);
            String[] result = lines.toArray(new String[0]);
            return result;
        } catch (Exception ex) {
            throw new UncheckedException(ex);
        }
    }
}
