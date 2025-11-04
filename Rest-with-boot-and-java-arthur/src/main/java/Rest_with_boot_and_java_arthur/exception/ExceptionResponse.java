package Rest_with_boot_and_java_arthur.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
