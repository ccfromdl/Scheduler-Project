package com.jp.springboot.repository;

import com.jp.springboot.Application;
import com.jp.springboot.model.Friend;
import com.jp.springboot.model.Member;
import com.jp.springboot.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = Application.class)
public class PersonCrudTest {
    @Autowired
    PersonRepository repository;

    @Test
    public void savePersonTest() throws Exception {
        Person person = new Person();
        person.setFirstName("Oscar");
        person.setLastName("Allen");

        repository.save(person);
    }

    @Test
    public void cascadeSavePersonTest() throws Exception {
        Member member = new Member();
        member.setName("Ella Bailey");

        Person person = new Person();
        person.setFirstName("Ella");
        person.setLastName("Bailey");
        person.setMember(member);

        repository.save(person);
    }

    @Test
    public void cascadeDeletePersonTest() throws Exception {
        repository.deleteById(3L);
    }

    @Test
    public void findPersonTest() throws Exception {
        Person person = repository.findById(1L).get();
        System.out.println(person.toString());
    }

    @Test
    public void binaryOneToOneCascadeSavePersonTest() throws Exception {
        Member member = new Member("Oscar Wright");

        Person person = new Person("Oscar", "Wright");
        person.setMember(member);
//        member.setPerson(person);

        repository.save(person);
    }

    @Test
    public void binaryOneToOneCascadeDeletePersonTest() throws Exception {
        repository.deleteById(1L);
    }

    @Test
    public void saveFriendsTest() throws Exception {
        Person person = new Person("Oliver", "Adam");
        Friend f1 = new Friend("George");
        Friend f2 = new Friend("Jessica");

        List<Friend> friends = new ArrayList();
        friends.add(f1);
        friends.add(f2);

        person.setFriends(friends);

        repository.save(person);
    }
}
