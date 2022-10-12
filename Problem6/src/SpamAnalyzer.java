public class SpamAnalyzer extends KeywordAnalyzer {
    /**
     * SpamAnalyzer должен конструироваться
     * от массива строк с ключевыми словами.
     * Объект этого класса должен сохранять в
     * своем состоянии этот массив строк в
     * приватном поле keywords.
     */
    private String[] keywords;//ключевые слова всякие
    private Label label;

    public SpamAnalyzer(String[] keywords)
    {
        super.keywords = keywords;
        super.label = Label.SPAM;
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
