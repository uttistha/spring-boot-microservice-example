package com.github.uttistha.orderservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {

    private String skuCode;
    private BigDecimal price;
    private int quantity;
}
