package com.infobip.urlShortener.service;

import java.util.Map;

public interface StatisticService {

  Map<String, Long> getStatistics(String AccountId);
}
