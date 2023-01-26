package com.makeup.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Delivery {
    POST ("Pošta"),
    EXPRESS_POST ("Brza pošta");

    public final String deliveryName;

}

