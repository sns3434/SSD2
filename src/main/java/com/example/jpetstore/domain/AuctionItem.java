package com.example.jpetstore.domain;

import java.io.Serializable;
import java.sql.Date;

public class AuctionItem implements Serializable{
	/* Private Fields */
	private String itemId;
	private String auctionid;
	private Date deadline;
	private int deposit;
	private Item item;
	  
	/* JavaBeans Properties */
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getAuctionid() {
		return auctionid;
	}
	public void setAuctionid(String auctionid) {
		this.auctionid = auctionid;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	  
  

}
