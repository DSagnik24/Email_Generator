package com.email.writer.emailwriter_app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
