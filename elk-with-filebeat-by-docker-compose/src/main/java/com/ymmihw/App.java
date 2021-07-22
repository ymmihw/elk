package com.ymmihw;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class App {
  public static void main(String[] args) throws InterruptedException {
    for (; ; ) {
      TimeUnit.SECONDS.sleep(1);
      log.debug("debug");
      log.info("info");
      log.warn("warn");
      log.error("error");
      if (1 == 1) {
        try {
          throw new IllegalArgumentException("abc");
        } catch (Exception e) {
          log.error("exception", e);
        }
      }
    }
  }
}
