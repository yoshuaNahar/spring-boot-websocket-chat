package com.example.lmorda;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    public String type;
    public String message;

    @JsonCreator
    public Message(@JsonProperty("type") String type, @JsonProperty("message") String message) {
        this.type = type;
        this.message = message;
    }

    @JsonIgnore
    public String getMessage(){
        return message;
    }
}
