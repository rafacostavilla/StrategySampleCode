import javax.swing.text.html.HTML;
import java.util.List;

public class TextProcessor {
    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public void setOutputFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case HTML :
                listStrategy = new HTMLListStrategy();
                break;
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();
                break;

        }
    }

    public TextProcessor(OutputFormat outputFormat) {
        setOutputFormat(outputFormat);
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
