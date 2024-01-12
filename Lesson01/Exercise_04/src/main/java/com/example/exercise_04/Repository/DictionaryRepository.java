package com.example.exercise_04.Repository;

import com.example.exercise_04.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private static List<Dictionary> dictionaryList;

    static {
        dictionaryList = new ArrayList<>();
        dictionaryList.add(new Dictionary("Banana", "chuoi"));
        dictionaryList.add(new Dictionary("improve", "cai thien"));
        dictionaryList.add(new Dictionary("apple", "tao"));
        dictionaryList.add(new Dictionary("university", "dai hoc"));
    }

    @Override
    public String search(String word) {
        for (Dictionary e : dictionaryList
        ) {
            if (e.getWordEn().equals(word)) {
                return e.getWordVn();
            }
        }
        return null;
    }

}
