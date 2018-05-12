package com.infobip.urlShortener.domain.url;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class URL {

    private String value;
}
