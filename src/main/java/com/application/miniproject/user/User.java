package com.application.miniproject.user;

import com.application.miniproject.user.type.UserType;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Setter
@Getter
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @Column
    private String imageUrl;

    @Column(nullable = false)
    @ColumnDefault("15")
    private int annualCount;

    @Enumerated(EnumType.STRING)
    private UserType role;

    @Column(nullable = false, name = "created_at")
    private Timestamp createdAt;

    @Column(nullable = false, name = "updated_at")
    private Timestamp updatedAt;

    public void update(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.imageUrl = user.getImageUrl();
        this.role = user.getRole();
    }
}
