package com.jp.springboot.repository;

import com.jp.springboot.Application;
import com.jp.springboot.model.Friend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class FriendCrudTest {
    @Autowired
    FriendRepository repository;

    @Test
    public void saveTest() throws Exception {
        Friend friend = new Friend("Jessica Austin");

        repository.save(friend);
    }
}
