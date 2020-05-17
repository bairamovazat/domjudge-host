package ru.ivmiit.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "contest")
public class Contest {

    //int(4) unsigned (autoincrement)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private Long id;

    @Column(name = "externalid", length = 255)
    private String externalId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "shortname", length = 255)
    private String shortName;

    @Column(name = "activatetime")
    private Double activateTime;

    @Column(name = "starttime")
    private Double startTime;

    @Column(name = "freezetime")
    private Double freezeTime;

    @Column(name = "endtime")
    private Double endTime;

    @Column(name = "unfreezeTime")
    private Double unfreezeTime;

    @Column(name = "deactivatetime")
    private Double deactivateTime;

    @Column(name = "activatetime_string", length = 64)
    private String activateTimeString;

    @Column(name = "starttime_string", length = 64)
    private String startTimeString;

    @Column(name = "freezetime_string", length = 64)
    private String freezeTimeString;

    @Column(name = "endtime_string", length = 64)
    private String endTimeString;

    @Column(name = "unfreezetime_string", length = 64)
    private String unfreezeTimeString;

    @Column(name = "deactivatetime_string", length = 64)
    private String deactivateTimeString;

    @Column(name = "finalizetime")
    private Double finalizeTime;

    @Lob
    @Column(name = "finalizecomment")
    private String finalizeComment;

    @Column(name = "b", columnDefinition = "Contests that will be run with this install")
    private Short b;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "starttime_enabled")
    private Boolean startTimeEnabled;

    @Column(name = "process_balloons")
    private Boolean processBalloons;

    @Column(name = "public")
    private Boolean publicContest;

    @Column(name = "open_to_all_teams")
    private Boolean openToAllTeams;
}
