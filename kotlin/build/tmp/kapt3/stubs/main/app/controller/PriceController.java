package app.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b*\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lapp/controller/PriceController;", "", "()V", "discountService", "Lapp/service/DiscountService;", "get", "Lapp/dto/GetDTO;", "context", "Lio/jooby/Context;", "(Lio/jooby/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "failOnRequired", "", "name", "", "Companion", "kotlin"})
@io.jooby.annotations.Path(value = {"/price"})
@javax.inject.Singleton()
public final class PriceController {
    @javax.inject.Inject()
    private app.service.DiscountService discountService;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID_PARAM = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ITEM_IDS_PARAM = "item_ids";
    public static final app.controller.PriceController.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    io.jooby.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super app.dto.GetDTO> p1) {
        return null;
    }
    
    private final java.lang.Void failOnRequired(@org.jetbrains.annotations.NotNull()
    io.jooby.Context $this$failOnRequired, java.lang.String name) {
        return null;
    }
    
    public PriceController() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lapp/controller/PriceController$Companion;", "", "()V", "ITEM_IDS_PARAM", "", "USER_ID_PARAM", "kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}