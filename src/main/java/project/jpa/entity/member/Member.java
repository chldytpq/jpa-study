package project.jpa.entity.member;


import lombok.Builder;
import project.jpa.coomon.entity.BaseTimeEntity;
import project.jpa.entity.team.Team;

import javax.persistence.*;


@Entity
public class Member extends BaseTimeEntity {

    protected Member() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;


    @Column(name = "name" , nullable = false)
    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @Builder
    public Member(String name, int age, Role role, Team team) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.team = team;
    }
}
