package project.jpa.entity.team;

import project.jpa.entity.member.Member;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "MEMBER_ID")
    private List<Member> member;

}
