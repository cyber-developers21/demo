package com.example.demo.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionHelper {

    public static  <T> boolean isListPresent(List<T> collection){
        return collection != null && collection.size() > 0;
    }

    public static  <S,T> boolean isMapPresent(Map<S,T> collection){
        return collection != null && collection.size() > 0;
    }
}
