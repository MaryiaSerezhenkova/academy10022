package by.it_academy.voating.core.entity;
public class LetterBuilder {
    private String info;
    private int id;

    private LetterBuilder() {
    }

    public static LetterBuilder create() {
        return new LetterBuilder();
    }

    public LetterBuilder setInfo(String info) {
        this.info = info;
        return this;
    }

    public LetterBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Letter build() {
        return new Letter(info, id);
    }
}