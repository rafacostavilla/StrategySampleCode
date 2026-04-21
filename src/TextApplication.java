import java.util.List;

public class TextApplication {
    public static void main(String args[]){
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(MarkdownListStrategy::new);
        tp.addList(List.of("banana", "apple", "orange"));
        System.out.println(tp.toString());

        TextProcessor<HTMLListStrategy> tp2 = new TextProcessor<>(HTMLListStrategy::new);
        tp2.addList(List.of("car", "bottle", "luggage"));
        System.out.println(tp2.toString());

    }
}
