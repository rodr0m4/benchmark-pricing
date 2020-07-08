package app.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lapp/store/FileBasedStore;", "T", "", "()V", "fileName", "", "getFileName", "()Ljava/lang/String;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "all", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readValues", "inputStream", "Ljava/io/BufferedReader;", "kotlin"})
public abstract class FileBasedStore<T extends java.lang.Object> {
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFileName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<T> readValues(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
    java.io.BufferedReader inputStream);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object all(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> p0) {
        return null;
    }
    
    public FileBasedStore() {
        super();
    }
}