package com.project.demo;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@entity
@Table(name="users")
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String lastName;\
    @Column(nullable=false, unique=true)
    private String email;
}