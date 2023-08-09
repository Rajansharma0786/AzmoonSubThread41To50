package com.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.BillingEntity;
import com.Entity.TblSubscription;
import com.Repository.TblBillingRepo;
import com.Repository.TblSubscriptionRepository;

@Service
public class SubscriptionService {

	@Autowired
	TblBillingRepo repo;
	
	@Autowired
	TblSubscriptionRepository repository;
	
	
	public void saveRenTypeInBilling(List<TblSubscription> subscription)
	{
		try 
		{
			
			for(TblSubscription getRecord : subscription)
			{
				
				
					
//				System.out.println("Control inside");
				String ani = getRecord.getAni().trim();
				List<BillingEntity> checkAni = repo.findByAni(ani);
				
				if(checkAni.size()==0) {
				BillingEntity entity = new BillingEntity();
				entity.setAni(getRecord.getAni());
				entity.setBillingDate(LocalDate.now());
				entity.setAmount(getRecord.getAmount());
				entity.setPackType(getRecord.getPack());
				entity.setType("REN");
				entity.setStatus(String.valueOf(getRecord.getPickStatus()));
				if(getRecord.getPickStatus()==null)
				{
					entity.setStatus("32");
					entity.setBillingStatus("32");
				}
				else {
					entity.setStatus(getRecord.getPickStatus());
					entity.setBillingStatus(getRecord.getPickStatus());
				}
				if(getRecord.getBillingType()==null)
				{
					entity.setBillingType("auto");
				}
				else
				{
					entity.setBillingType(getRecord.getBillingType());
				}
				entity.setLanguage(getRecord.getLanguage());
				entity.setMAct(getRecord.getMAct());
				entity.setService(getRecord.getService());
				entity.setTxnId(getRecord.getTxnId());
				repo.save(entity);
				getRecord.setCurrentDate(LocalDate.now());
				repository.save(getRecord);
				System.out.println("REN ANi Save In Table Billing"+getRecord.getAni());
				System.out.println("REN record is save in tbl_billing");
				
				}
				
//				List<BillingEntity> billing = repo.findByStatusAndType(entity.getStatus(),entity.getType());
//				service.hitBilling(billing);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
