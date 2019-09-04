package com.sameer.demo.test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MainMethod {

  public static void main(String[] args) {

    System.out.println("welcome to reactive programming !!");

    //1.
    Mono<String> data = Mono.just("sample string");

    data.subscribe(i -> System.out.println(i));

    //2.
    Flux<String> data2 = Flux.just("sameer", "sameer2", "sample String");
    Flux<String> data3 = data2.filter(i -> i.contains("sample "));
    data3.subscribe(i -> System.out.println(i));

    //3.
    Mono<String> data4 = Mono.just("1");
    Mono<Integer> data5 = data4.map(i->Integer.valueOf(i));

    data5.subscribe(i-> System.out.println(i+2));


  }
}
