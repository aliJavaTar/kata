package com.pattern;

public interface Cloud {
    DownloadFile downloadFile(String fileName);

    UplodeFile uplodeFile(String fileName);
}
