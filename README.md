# Benchmark

## Requerimientos Funcionales

* Un Item es una entidad con un nombre, un precio base y una marca.

```
entity Item {
  id: String
  price: Number
  name: String
  brand: String
}
```

* Un User es una entidad con N medios de pago asociados

```
entity User {
  id: String
  payment_methods: String[]
}
```

* Un Payment Method es una entidad

```
entity PaymentMethod {
  id: String
}
```

### Descuentos

* Un descuento es una operación aplicable sobre un Item, todos cuentan con un porcentaje de descuento

```
entity Discount {
  discount: Number
}
```

* Un Descuento por marca es un descuento si y solo si coincide la marca

```
entity BrandDiscount : Discount {
  brand: String
}
```

* Un Descuento por Payment Method es un descuento que es solo aplicable a payment methods de IDS particulares

```
entity PaymentMethodDiscount : Discount {
  methods: String[]
}
```

* Un Descuento por precio es un descuento que aplica a items cuyo precio supere un cierto umbral

```
entity PriceDiscount : Discount {
  bound: Number
}
```

## Requerimientos no Funcionales

* Throughput alto (>1Mrpm).
* Response time bajo (<10ms P99).