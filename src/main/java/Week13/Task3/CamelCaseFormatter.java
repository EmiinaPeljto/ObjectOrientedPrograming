package Week13.Task3;

public class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText (String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String result = "";
        boolean newText = true;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                result += newText ? Character.toUpperCase(c) : Character.toLowerCase(c);
                newText = false;
            } else {
                newText = true;
            }
        }
        return result;
    }
}
