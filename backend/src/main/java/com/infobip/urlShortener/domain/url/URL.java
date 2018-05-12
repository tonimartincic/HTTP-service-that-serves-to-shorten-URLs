package com.infobip.urlShortener.domain.url;

import com.infobip.urlShortener.enumeration.RedirectType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
public class URL {

  @Id
  private String value;

  @Enumerated(EnumType.STRING)
  private RedirectType redirectType;
}
