package com.laioffer.onlineorder.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RegisterBody(
        @JsonProperty  String email,
        @JsonProperty String password,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName
) {
}
