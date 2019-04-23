package com.twich.pf.sns;

import java.math.BigDecimal;

public class SnsMsgNo {
	private BigDecimal start;
	private BigDecimal end;
	
	public SnsMsgNo() {
		// TODO Auto-generated constructor stub
	}

	public SnsMsgNo(BigDecimal start, BigDecimal end) {
		super();
		this.start = start;
		this.end = end;
	}

	public BigDecimal getStart() {
		return start;
	}

	public void setStart(BigDecimal start) {
		this.start = start;
	}

	public BigDecimal getEnd() {
		return end;
	}

	public void setEnd(BigDecimal end) {
		this.end = end;
	}
}
