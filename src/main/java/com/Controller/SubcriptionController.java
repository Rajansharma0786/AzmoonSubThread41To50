package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.Entity.TblSubscription;
import com.Repository.TblBillingRepo;
import com.Repository.TblSubscriptionRepository;
import com.Service.SubscriptionService;

//@RestController
@Component
public class SubcriptionController {

	@Autowired
	TblSubscriptionRepository subscriptionRepository;

	@Autowired
	SubscriptionService service;

	@Autowired
	TblBillingRepo billingRepo;

	private final String hour = "4";
	private final String hour1 = "11";
	private final String hour2 = "17";

	@Scheduled(cron = "0 25 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 25 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 25 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread41() {

		try {
			String status = "41";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 26 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 26 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 26 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread42() {

		try {
			String status = "42";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 27 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 27 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 27 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread43() {

		try {
			String status = "43";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 28 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 28 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 28 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread44() {

		try {
			String status = "44";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 29 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 29 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 29 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread45() {

		try {
			String status = "45";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 30 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 30 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 30 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread46() {

		try {
			String status = "46";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 31 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 31 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 31 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread47() {

		try {
			String status = "47";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 32 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 32 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 32 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread48() {

		try {
			String status = "48";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 33 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 33 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 33 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread49() {

		try {
			String status = "49";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 34 " + hour + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 34 " + hour1 + " * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 34 " + hour2 + " * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread50() {

		try {
			String status = "50";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//						System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}
}
