package dk.via.session4.exercise4_2.model;

public class ModelManager implements Model {
    private final Converter converter;

    public ModelManager() {
        this.converter = new Converter();
    }

    @Override
    public String convert(String source) {
        return converter.toUpperCase(source);
    }
}
