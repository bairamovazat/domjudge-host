package ru.ivmiit.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "judgehost")
public class JudgeHost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //В домджадже ид - hostname
    @Column(name = "host_name", length = 64)
    private String hostName;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "polltime")
    private Double pollTime;

}
