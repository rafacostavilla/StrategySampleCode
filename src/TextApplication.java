import java.util.List;

public class TextApplication {
    public static void main(String args[]){
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.addList(List.of("banana", "apple", "orange"));
        System.out.println(tp.toString());

        tp.clear();
        tp.setOutputFormat(OutputFormat.HTML);
        tp.addList(List.of("car", "bottle", "luggage"));
        System.out.println(tp.toString());

    }
}
