public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected String[] keywords;
    protected  Label label;

    public String[] getKeywords() {
        return keywords;
    }
    public Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        for (String key: keywords){
            if (text.contains(key)){
                return getLabel();
            }
        }
        return Label.OK;
    }


}
