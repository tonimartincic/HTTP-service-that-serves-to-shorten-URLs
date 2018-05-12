package com.infobip.urlShortener.domain.account;

import com.infobip.urlShortener.enumeration.OpeningAccountDescription;
import lombok.Data;

@Data
public class OpeningAccountResponse {

    private Boolean success;

    private OpeningAccountDescription openingAccountDescription;

    private String password;

    public OpeningAccountResponse(Boolean success, OpeningAccountDescription openingAccountDescription, String password) {
        this.success = success;
        this.openingAccountDescription = openingAccountDescription;
        this.password = password;
    }
}
