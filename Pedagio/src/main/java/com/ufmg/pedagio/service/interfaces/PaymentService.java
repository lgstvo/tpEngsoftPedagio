package com.ufmg.pedagio.service.interfaces;

public interface PaymentService {
	public void payWithSmartcard(String identificadorSmartcard);
	public void payWithSign(String identificadorSign);
}
