package com.example.exercise_04.model;

public class Dictionary {
    private String wordEn;
    private String wordVn;
    private String result;

    public Dictionary(String wordEn, String wordVn) {
        this.wordEn = wordEn;
        this.wordVn = wordVn;
    }

    public Dictionary(String wordEn, String wordVn, String result) {
        this.wordEn = wordEn;
        this.wordVn = wordVn;
        this.result = result;
    }

    public Dictionary() {
    }

    public String getWordEn() {
        return wordEn;
    }

    public void setWordEn(String wordEn) {
        this.wordEn = wordEn;
    }

    public String getWordVn() {
        return wordVn;
    }

    public void setWordVn(String wordVn) {
        this.wordVn = wordVn;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "dictionary{" +
                "wordEn='" + wordEn + '\'' +
                ", wordVn='" + wordVn + '\'' +
                '}';
    }
}
