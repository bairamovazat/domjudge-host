package ru.ivmiit.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "problem")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "externalid", length = 255)
    private String externalId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "timelimit")
    private Float timeLimit;

    @Column(name = "memlimit")
    private Integer memLimit;

    @Column(name = "outputlimit")
    private Integer outputLimit;

    @Column(name = "special_run", length = 32)
    private String specialRun;

    @Column(name = "special_compare", length = 32)
    private String specialCompare;

    @Column(name = "special_compare_args", length = 255)
    private String specialCompareArgs;

    @Column(name = "combined_run_compare")
    private Boolean combinedRunCompare;

    @Lob
    @Column(name = "problemtext")
    private String problemText;

    @Lob
    @Column(name = "problemtext_type")
    private String problemTextType;



}
