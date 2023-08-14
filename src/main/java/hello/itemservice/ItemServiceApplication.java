package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// 메시지 관리 기능을 사용하려면 스프링이 제공하는 MessageSource를 스프링 빈으로 등록하면 된다.
	// MessageSource는 인터페이스이다. 따라서 구현체인 ResourceBundleMessageSource를 스프링 빈으로 등록하면 된다.
	// 그런데 스프링 부트를 쓰면 아래 코드 자동으로 만들어준다.
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasenames("messages", "errors"); // messages.properties, errors.properties를 읽어들인다.
//		messageSource.setDefaultEncoding("utf-8"); // 인코딩에 대한 정보
//		return messageSource;
//	}
}
