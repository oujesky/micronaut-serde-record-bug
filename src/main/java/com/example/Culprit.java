package com.example;

import io.micronaut.serde.annotation.Serdeable.Deserializable;

@Deserializable
record Culprit(
    Inner inner
) {

    @Deserializable
    private record Inner() {}

}
