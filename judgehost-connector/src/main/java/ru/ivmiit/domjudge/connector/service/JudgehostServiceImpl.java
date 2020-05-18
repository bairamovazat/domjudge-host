package ru.ivmiit.domjudge.connector.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ivmiit.domjudge.connector.transfer.*;

import java.util.*;

@Slf4j
@Service
public class JudgehostServiceImpl implements JudgehostService {
    private static HashMap<String, Object> configMap = new HashMap<>();

    static {
        configMap.put("diskspace_error",1048576);
        configMap.put("script_timelimit",30);
        configMap.put("script_memory_limit",2097152);
        configMap.put("script_filesize_limit",540672);
        configMap.put("process_limit",64);
        configMap.put("output_storage_limit",50000);
        configMap.put("timelimit_overshoot","1s|10%");
        configMap.put("update_judging_seconds",5);
    }
    @Override
    public Object getConfig(String name) {
        return configMap.get(name);
    }

    @Override
    public  List<CodeSourceDto> getSubmissionSourceCode(Long contestId, Long submissionId) {
        return Arrays.asList(CodeSourceDto.builder()
                .submissionFileId("7")
                .submissionId("6")
                .filename("HelloWorld.java")
                .source("cHVibGljIGNsYXNzIEhlbGxvV29ybGQgewogICAgcHVibGljIHN0YXRpYyB2b2lkIG1haW4oU3RyaW5nW10gYXJncykgewogICAgICAgIFN5c3RlbS5vdXQucHJpbnRsbigiSGVsbG8gd29ybGQhIik7CiAgICB9Cn0K")
                .build());
    }

    @Override
    public NextJudginDto nextJudging(String judgehostName) {
        Map<String, TestCaseDto> testCaseDtoMap = new HashMap<>();

        testCaseDtoMap.put("1", TestCaseDto.builder()
                .md5sum_input("b026324c6904b2a9cb4b88d6d61c81d1")
                .md5sum_output("59ca0efa9f5633cb0371bbc0355478d8")
                .testcaseId(1L)
                .rank(1L)
                .build());
        NextJudginDto nextJudginDto = NextJudginDto.builder()
                .submissionId(6L)
                .contestId(2L)
                .teamId(2L)
                .problemId(1L)
                .languageName("java")
                .languageExtensions(Arrays.asList("java"))
                .filterCompilerFiles(true)
                .entryPoint(null)
                .originalSubmitId(null)
                .maxRuntime(5L)
                .memLimit(2097152L)
                .outputLimit(8192L)
                .run("run")
                .compare("compare")
                .compareArgs(null)
                .compileScript("java_javac_detect")
                .combinedRunCompare(false)
                .compareMd5sum("fbab86c0fb3676d68a99d5d905afd8d5")
                .runMd5sum("7be7891f2fc2c18ebaf0bf023f705b15")
                .compileScriptMd5sum("e8d555b99b24187aca249cfa4c4246b3")
                .judgingId((long) 7)
                .testCases(testCaseDtoMap)
                .build();
        return nextJudginDto;
    }

    @Override
    public void updateJudging(String judgehostName, Long judgingId, UpdateJudgingDto updateJudgingDto) {
        log.info("UpdateJudgingDto: " + updateJudgingDto.toString() + ", judgehostName: " + judgehostName + ", judgingId: " + judgingId);
    }

    @Override
    public String getInputTestCaseId(Long testCaseId) {
        return "Mgo=";
    }

    @Override
    public String getOutputTestCaseId(Long testCaseId) {
        return "SGVsbG8gV29ybGQhCg==";
    }

    @Override
    public List<JudgehostsDto> registerJudgehosts() {
        return new ArrayList<JudgehostsDto>();
    }
}
