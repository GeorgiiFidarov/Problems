public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int maxLength)
    {
        this.maxLength = maxLength;
        label = Label.TOO_LONG;
    }
    @Override
    public Label processText(String text) {
        if(text.length() > maxLength)
            return label;
        return Label.OK;
    }
}
