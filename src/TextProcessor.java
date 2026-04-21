import javax.swing.text.html.HTML;
import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {
    private StringBuilder sb = new StringBuilder();
    private final LS listStrategy;

    public TextProcessor(Supplier<? extends LS> constructor) {
        listStrategy = constructor.get();
    }

    public void addList(List<String> list){
        listStrategy.start(this.sb);
        for(String item: list){
            listStrategy.addItem(this.sb, item);
        }
        listStrategy.end(this.sb);
    }

    public void clear(){
        this.sb.setLength(0);
    }

    @Override
    public String toString() {
        return this.sb.toString();
    }
}
