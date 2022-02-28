package com.YoussefELmoudene.java.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class AccountId implements Serializable {
    private Long id_device;
    private LocalDateTime date;

    public AccountId(Long id_device, LocalDateTime date) {
        this.id_device = id_device;
        this.date = date;
    }

    public AccountId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountId accountId = (AccountId) o;
        return id_device.equals(accountId.id_device) &&
                date.equals(accountId.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_device, date);
    }
}