package com.javalesson.generic;

import java.util.List;

public interface BoxList<E,T> extends List<E> {


    E calcSum(E elem1, T elem2);


}
