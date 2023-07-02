package com.javalesson.collection.map.hashmap;

import java.util.Objects;

public class WordWrapper implements Comparable<WordWrapper> {
    private final String word;
    private final Integer count;


    public WordWrapper(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int compareTo(WordWrapper thatWord) {
        if (count < thatWord.getCount()) {
            return -1;
        }
        if (count > thatWord.getCount()) {
            return 1;
        }
        return word.compareTo(thatWord.getWord());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordWrapper)) return false;
        WordWrapper that = (WordWrapper) o;
        return Objects.equals(getWord(), that.getWord()) && Objects.equals(getCount(), that.getCount());
    }




    @Override
    public String toString() {
        return word + " -> " + count;
    }
}
