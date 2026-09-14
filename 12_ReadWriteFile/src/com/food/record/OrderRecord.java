package com.food.record;

import java.time.LocalDate;


public record OrderRecord(String id, String customer, String restaurant, String food, double price, LocalDate date) {
}
