/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
 
import io.swagger.annotations.ApiModelProperty;
 
public class Greeting {
 
    private final long id;
    private final String content;
 
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
 
    public long getId() {
        return id;
    }
 
    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getContent() {
        return content;
    }
}
