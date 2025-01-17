package com.s;

import com.s.good.SentEmailInter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserManagementShould {

    @Test
    void add_user() {
        SentEmailInter mock = Mockito.mock(SentEmailInter.class);
        var user = new User();
        var userManagement = new UserManagement(mock);
        User addedUser = userManagement.addUser(user);

        Assertions.assertThat(addedUser).isEqualTo(new User());

    }

}