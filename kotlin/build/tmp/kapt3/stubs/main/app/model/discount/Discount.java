package app.model.discount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u0002\u000b\f\u00a8\u0006\r"}, d2 = {"Lapp/model/discount/Discount;", "", "amount", "", "(D)V", "invoke", "payload", "Lapp/model/discount/DiscountPayload;", "(Lapp/model/discount/DiscountPayload;)Ljava/lang/Double;", "isApplicable", "", "Lapp/model/discount/PaymentMethodDiscount;", "Lapp/model/discount/ItemFieldDiscount;", "kotlin"})
@com.fasterxml.jackson.annotation.JsonSubTypes(value = {@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = app.model.discount.PaymentMethodDiscount.class, name = "PAYMENT_METHOD"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = app.model.discount.BrandDiscount.class, name = "BRAND"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = app.model.discount.PriceDiscount.class, name = "PRICE"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = app.model.discount.ItemIDDiscount.class, name = "ITEM_ID")})
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property = "type")
public abstract class Discount {
    private final double amount = 0.0;
    
    protected abstract boolean isApplicable(@org.jetbrains.annotations.NotNull()
    app.model.discount.DiscountPayload payload);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double invoke(@org.jetbrains.annotations.NotNull()
    app.model.discount.DiscountPayload payload) {
        return null;
    }
    
    private Discount(double amount) {
        super();
    }
}