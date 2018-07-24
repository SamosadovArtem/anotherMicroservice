package com.micros.interraction;

import org.springframework.web.client.RestTemplate;

public class Interractor {

  private final RestTemplate rest;
  private final String serviceFullPath;

  private final static String GATEWAY_PATH = "http://localhost:8080/services";

  protected Interractor(final String servicePath) {
    this.rest = new RestTemplate();
    this.serviceFullPath = GATEWAY_PATH + servicePath;
  }

  protected <T> T get(final String path, final Class<T> type) {
    T result = rest.getForObject(serviceFullPath + path, type);
    return result;
  }

  protected <T , E> T post(final String path, final E object, final Class<T> type) {
    return rest.postForObject(serviceFullPath + path, object, type);
  }
}
