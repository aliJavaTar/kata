package com.func;

@FunctionalInterface
public interface FucGeneric<T, R> {
    R execute(T t);
}
