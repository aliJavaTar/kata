package com.pattern.abs.aws;

import com.pattern.abs.Delete;

public class AWSDelete implements Delete {
    @Override
    public void delete() {
        System.out.println("Delete from AWS");
    }
}
