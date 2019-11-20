package edu.mum.cs544.sharingcar.userservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import java.util.List;


@AllArgsConstructor
@Getter @Setter
@Table
public class User {

    @PrimaryKey
    private @NonNull int id;
    private @NonNull String userName;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String phone;
    private @NonNull String email;
    private @NonNull int age;

    //private List<Role> roles;

}
