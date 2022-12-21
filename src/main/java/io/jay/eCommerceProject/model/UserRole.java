package io.jay.eCommerceProject.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private int id;

    @Column(name = "user_role")
    private String role;

}
