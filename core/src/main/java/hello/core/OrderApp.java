package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();
		
//		MemberService memberService = new MemberServiceImpl();
//		OrderService orderService = new OrderServiceImpl();
		
		Long memberId = 1L;
		Member member = new Member(memberId, "JamesbondA", Grade.VIP);
		Member member2 = new Member(2L, "JamesbondF", Grade.BASIC);
		memberService.join(member);
		memberService.join(member2);
		
		Order order = orderService.createOrder(memberId, "최신 컴퓨터", 20000);
		System.out.println("order==" + order);
		Order order2 = orderService.createOrder(2L, "가죽 장갑", 20000);
		System.out.println("order2==" + order2);
	}

}
