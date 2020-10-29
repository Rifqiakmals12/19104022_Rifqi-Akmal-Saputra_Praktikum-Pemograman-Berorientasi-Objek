package com.RifqiAS.Modul4.Interface;

public class ChildCD extends CD implements InterfaceCD {
    // Constructor yang memiliki parameter ukuranCD dan hargaCD
    public ChildCD(String ukuranCD, long hargaCD) {
        super(ukuranCD, hargaCD);
    }
}
