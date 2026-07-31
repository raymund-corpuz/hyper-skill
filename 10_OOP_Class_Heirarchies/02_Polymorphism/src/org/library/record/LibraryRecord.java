package org.library.record;

import java.time.LocalDate;

public record LibraryRecord(String title, String author, boolean available, LocalDate dateOfIssue) {
}
