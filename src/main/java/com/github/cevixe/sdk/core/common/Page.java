package com.github.cevixe.sdk.core.common;

import java.util.List;

public interface Page<T> {
    List<T> getItems();
    String getNextToken();
}
