package com.work.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediatek implements MobileProcessor {

	
	
	public void process() {
		System.out.println("2nd best computer");
	}

}
