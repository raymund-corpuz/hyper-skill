package org.library.record;

import java.time.LocalDate;

public record BorrowRecord(String borrowerName, String title, String author, String category, LocalDate issueDate) {
}
