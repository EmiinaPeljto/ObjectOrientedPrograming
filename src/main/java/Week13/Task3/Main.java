package Week13.Task3;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setFormatter(new UpperCaseFormatter());
        System.out.println("Uppercace: " + editor.formatText("word"));

        editor.setFormatter(new LowerCaseFormatter());
        System.out.println("Lowercase: " + editor.formatText("wORd"));

        editor.setFormatter(new CamelCaseFormatter());
        System.out.println("Camelcase: " + editor.formatText("hello world"));
    }
}
