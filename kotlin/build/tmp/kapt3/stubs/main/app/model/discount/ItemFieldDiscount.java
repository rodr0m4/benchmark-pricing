package app.model.discount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lapp/model/discount/ItemFieldDiscount;", "Lapp/model/discount/Discount;", "amount", "", "(D)V", "isApplicable", "", "item", "Lapp/model/Item;", "payload", "Lapp/model/discount/DiscountPayload;", "Lapp/model/discount/BrandDiscount;", "Lapp/model/discount/PriceDiscount;", "Lapp/model/discount/ItemIDDiscount;", "kotlin"})
public abstract class ItemFieldDiscount extends app.model.discount.Discount {
    private final double amount = 0.0;
    
    public abstract boolean isApplicable(@org.jetbrains.annotations.NotNull()
    app.model.Item item);
    
    @java.lang.Override()
    protected boolean isApplicable(@org.jetbrains.annotations.NotNull()
    app.model.discount.DiscountPayload payload) {
        return false;
    }
    
    private ItemFieldDiscount(double amount) {
    }
}