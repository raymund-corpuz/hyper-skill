package hyperskill.hotel.management.model;

import hyperskill.hotel.management.model.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {
    private String paymentId;
    private String bookingId;
    private double amount;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentDate;

    public Payment(String paymentId, String bookingId, double amount, PaymentStatus paymentStatus, LocalDateTime paymentDate) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }

    public void displayProfile() {
        System.out.println(paymentId + "|" + bookingId + "|" + amount + "|" + paymentStatus + "|" + paymentDate);
    }

    //getter

    public String getPaymentId() {
        return paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    //setter

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    //toString

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", amount=" + amount +
                ", paymentStatus=" + paymentStatus +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
