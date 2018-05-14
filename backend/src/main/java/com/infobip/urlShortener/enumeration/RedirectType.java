package com.infobip.urlShortener.enumeration;

public enum RedirectType {

    MOVED_PERMANENTLY(1L, 301),
    FOUND(2L, 302);

    private final Long id;

    private final Integer value;

    RedirectType(final Long id, final Integer value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

  public static RedirectType getByValue(final Integer value) {
    if(value == null) {
      return RedirectType.FOUND;
    }

    switch (value) {
      case 301:
        return RedirectType.MOVED_PERMANENTLY;
      default:
        return RedirectType.FOUND;
    }
  }
}
