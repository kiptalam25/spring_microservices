package com.alibou.student.reactive;

import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "items")
@Builder
public class ReactiveItem {
//	@Id
	private int id;
	private String name;
	private Date dateCreated;
	private Long unitPrice;
	private Long quantity;
	private Long category_id;
}
