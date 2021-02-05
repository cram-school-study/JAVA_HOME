package hello.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class OrderServiceTest {
	
	MemberService memberService;
	OrderService orderService;
	
	@BeforeEach
	public void beForeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();		
	}

	@Test
	void createOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId, "jamebondA", Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "온풍기", 10000);
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
		
	}
}
