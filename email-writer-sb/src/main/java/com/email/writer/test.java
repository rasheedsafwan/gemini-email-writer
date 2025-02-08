package com.email.writer;

import com.email.writer.model.EmailRequest;

public class test {
    public static void main(String[] args) {
        EmailRequest request = new EmailRequest();
        request.setTone("formal");
        System.out.println(request.getTone());  // Should print "formal"
    }
}
