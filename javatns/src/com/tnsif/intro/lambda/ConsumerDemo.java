package com.tnsif.intro.lambda;
import java.util.function.Consumer;
public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> len=str->System.out.println(str.length());
		String[] arr= {"Gopi","Ram","Krishna"};
		for(String k:arr)
			len.accept(k);
	}

}

