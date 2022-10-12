public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    private Label label;

    public NegativeTextAnalyzer()
    {
        super.label = Label.NEGATIVE_TEXT;
        super.keywords = new String[]{":(",  "=(",  ":|"};
    }
    @Override
    public String[] getKeywords() {
        return super.keywords;
    }
    @Override
    public Label getLabel() {
        return super.label;
    }
    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
