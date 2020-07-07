package com.fund.criteria;

import java.io.Serializable;

public class Criteria implements Serializable {

	private static final long serialVersionUID = 4226661337635130766L;

	private String startSellDate;
	private String endSellDate;

	public Criteria() {
		super();
	}

	public Criteria(String startSellDate, String endSellDate) {
		super();
		this.startSellDate = startSellDate;
		this.endSellDate = endSellDate;
	}

	public String getStartSellDate() {
		return startSellDate;
	}

	public void setStartSellDate(String startSellDate) {
		this.startSellDate = startSellDate;
	}

	public String getEndSellDate() {
		return endSellDate;
	}

	public void setEndSellDate(String endSellDate) {
		this.endSellDate = endSellDate;
	}

}
