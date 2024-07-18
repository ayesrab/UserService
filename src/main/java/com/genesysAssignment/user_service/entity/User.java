package com.genesysAssignment.user_service.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection= "users")
@Data
public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull
    private String userName;
    @Indexed(unique = true)
    @NonNull
    private String emailAddress;
    @NonNull
    private String password;
    private List<String> roles;
    private LocalDateTime lastLoginTime;
}
