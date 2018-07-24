package com.micros.interraction;

import java.util.Collections;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class Interractor {

  private final RestTemplate rest;
  private final String serviceFullPath;

  private final static String GATEWAY_PATH = "http://localhost:8080/services";

  Interractor(final String servicePath) {
    this.rest = new RestTemplate((ClientHttpRequestFactory) Collections.singletonList(new MappingJackson2HttpMessageConverter()));
    this.serviceFullPath = GATEWAY_PATH + servicePath;
  }

  protected <T> T get(final String path, final Class<T> type) {
    return rest.getForObject(serviceFullPath + path, type);
  }

  protected <T , E> T post(final String path, final E object, final Class<T> type) {
    return rest.postForObject(serviceFullPath + path, object, type);
  }
}
