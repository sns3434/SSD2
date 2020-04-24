package com.example.jpetstore.dao;

public interface AuctionDao {
	 public String getUsername();
	 public boolean AuctionSuccess (int money);
	
	void MaxBidding(int money, String bidder);
	
}
