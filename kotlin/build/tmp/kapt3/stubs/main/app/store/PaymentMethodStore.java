package app.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lapp/store/PaymentMethodStore;", "", "all", "", "Lapp/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "kotlin"})
public abstract interface PaymentMethodStore {
    public static final app.store.PaymentMethodStore.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object all(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Set<app.model.PaymentMethod>> continuation);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lapp/store/PaymentMethodStore$Companion;", "Lapp/store/PaymentMethodStore;", "Lapp/store/FileBasedStore;", "Lapp/model/PaymentMethod;", "()V", "fileName", "", "getFileName", "()Ljava/lang/String;", "readValues", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "inputStream", "Ljava/io/BufferedReader;", "kotlin"})
    public static final class Companion extends app.store.FileBasedStore<app.model.PaymentMethod> implements app.store.PaymentMethodStore {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String fileName = "mocks/payment_methods.json";
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getFileName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<app.model.PaymentMethod> readValues(@org.jetbrains.annotations.NotNull()
        com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
        java.io.BufferedReader inputStream) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}