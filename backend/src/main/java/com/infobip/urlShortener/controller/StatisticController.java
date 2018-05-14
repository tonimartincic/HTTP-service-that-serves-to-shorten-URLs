package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatisticController {

  private StatisticService statisticService;

  @Autowired
  public StatisticController(StatisticService statisticService) {
    this.statisticService = statisticService;
  }

  @GetMapping("/statistic/{AccountId}")
  public Map<String, Long> getLoggedUser(@PathVariable String AccountId) {
    return this.statisticService.getStatistics(AccountId);
  }
}
