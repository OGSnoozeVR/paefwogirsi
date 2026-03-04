package jarvis;

public class JarvisBrain {

    public static String process(String input) {

        input = input.toLowerCase();

        if(input.contains("hello"))
            return "Hello. How may I assist you?";

        if(input.contains("time"))
            return InternetTools.getTime();

        if(input.contains("search"))
            return InternetTools.search(input);

        if(input.contains("remember"))
            return "I will remember that.";

        return "I am still learning.";
    }

}
