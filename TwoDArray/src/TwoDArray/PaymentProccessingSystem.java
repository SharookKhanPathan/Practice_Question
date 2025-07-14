<<<<<<< HEAD
package TwoDArray;
class Payment{
	void processpayment(){
		System.out.println("Payment process...");
	}
}
class UPIPayment extends Payment{
	void processpayment(){
		System.out.println("UPI Payment Successfull");
	}
}
class CardPayment extends Payment{
	void processpayment(){
		System.out.println("Card Payment Successfull");
	}
}
class WalletPayment extends Payment{
	void processpayment(){
		System.out.println("Wallet Payment Successfull");
	}
}
public class PaymentProccessingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p = new UPIPayment();
		p.processpayment();
		p = new CardPayment();
		p.processpayment();
		p = new WalletPayment();
		p.processpayment();
	}

}
=======
package TwoDArray;
class Payment{
	void processpayment(){
		System.out.println("Payment process...");
	}
}
class UPIPayment extends Payment{
	void processpayment(){
		System.out.println("UPI Payment Successfull");
	}
}
class CardPayment extends Payment{
	void processpayment(){
		System.out.println("Card Payment Successfull");
	}
}
class WalletPayment extends Payment{
	void processpayment(){
		System.out.println("Wallet Payment Successfull");
	}
}
public class PaymentProccessingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p = new UPIPayment();
		p.processpayment();
		p = new CardPayment();
		p.processpayment();
		p = new WalletPayment();
		p.processpayment();
	}

}
>>>>>>> branch 'master' of https://github.com/SharookKhanPathan/Practice_Question.git
