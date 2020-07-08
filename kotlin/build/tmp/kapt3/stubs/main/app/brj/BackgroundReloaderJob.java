package app.brj;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lapp/brj/BackgroundReloaderJob;", "Lorg/quartz/Job;", "itemServiceImpl", "Lapp/service/ItemServiceImpl;", "discountServiceImpl", "Lapp/service/DiscountServiceImpl;", "paymentMethodServiceImpl", "Lapp/service/PaymentMethodServiceImpl;", "userServiceImpl", "Lapp/service/UserServiceImpl;", "(Lapp/service/ItemServiceImpl;Lapp/service/DiscountServiceImpl;Lapp/service/PaymentMethodServiceImpl;Lapp/service/UserServiceImpl;)V", "jobs", "", "Lapp/brj/BackgroundReloadable;", "execute", "", "context", "Lorg/quartz/JobExecutionContext;", "kotlin"})
@javax.inject.Singleton()
public final class BackgroundReloaderJob implements org.quartz.Job {
    private final java.util.List<app.brj.BackgroundReloadable> jobs = null;
    
    @java.lang.Override()
    @io.jooby.quartz.Scheduled(value = "1m")
    public void execute(@org.jetbrains.annotations.Nullable()
    org.quartz.JobExecutionContext context) {
    }
    
    @javax.inject.Inject()
    public BackgroundReloaderJob(@org.jetbrains.annotations.NotNull()
    app.service.ItemServiceImpl itemServiceImpl, @org.jetbrains.annotations.NotNull()
    app.service.DiscountServiceImpl discountServiceImpl, @org.jetbrains.annotations.NotNull()
    app.service.PaymentMethodServiceImpl paymentMethodServiceImpl, @org.jetbrains.annotations.NotNull()
    app.service.UserServiceImpl userServiceImpl) {
        super();
    }
}