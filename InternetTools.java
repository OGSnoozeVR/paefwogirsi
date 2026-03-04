package jarvis;

import java.time.LocalTime;

public class InternetTools {

    public static String getTime() {

        return "The current time is " + LocalTime.now().withNano(0);

    }

    public static String search(String query) {

        return "Internet search not yet implemented.";

    }

}
