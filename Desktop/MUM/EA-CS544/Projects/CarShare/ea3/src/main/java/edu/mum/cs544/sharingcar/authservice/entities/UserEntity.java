package edu.mum.cs544.sharingcar.authservice.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@AllArgsConstructor
@Getter @Setter
@Table
public class UserEntity {

    @PrimaryKey
    private int id;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String password;
    private @NonNull String email;
}
