public class MarkdownListStrategy implements ListStrategy{

    // * item
    @Override
    public void addItem(StringBuilder sb, String item){
        sb.
                append("* ").
                append(item)
                .append(System.lineSeparator());
    }

}
