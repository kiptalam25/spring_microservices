package com.alibou.student.reactive;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
//import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ap1/v1/reactive")
public class ReactiveController {
private final ReactiveService reactiveService;

//@GetMapping
//public Flux<ReactiveItem> findAllItems(){
//	return reactiveService.findAllItems();
//}
}
