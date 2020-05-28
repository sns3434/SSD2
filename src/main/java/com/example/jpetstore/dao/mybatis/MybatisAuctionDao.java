package com.example.jpetstore.dao.mybatis;


import com.example.jpetstore.dao.AuctionDao;

public class MybatisAuctionDao  implements AuctionDao{
	String name;
	int money2;
	static int max;
	static String maxBidder;
	
	public static String getMaxBidder() {
		return maxBidder;
	}

	public static void setMaxBidder(String maxBidder) {
		MybatisAuctionDao.maxBidder = maxBidder;
	}

	@Override
	public String getUsername() {
		
		return name;
	}

	@Override
	public boolean AuctionSuccess(int money) {
		//스케줄러 시간이 끝나면
		if(money < max)
			return false;
		else 
			return true;
	}

	@Override
	public void MaxBidding(int money, String bidder) {
		if(money > max) {
			max = money;
			maxBidder = bidder;
		}
			
		
		
	}


	}
