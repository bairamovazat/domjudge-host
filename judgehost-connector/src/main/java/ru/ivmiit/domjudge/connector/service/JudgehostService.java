package ru.ivmiit.domjudge.connector.service;

import ru.ivmiit.domjudge.connector.transfer.CodeSourceDto;
import ru.ivmiit.domjudge.connector.transfer.JudgehostsDto;
import ru.ivmiit.domjudge.connector.transfer.NextJudginDto;
import ru.ivmiit.domjudge.connector.transfer.UpdateJudgingDto;

import java.util.List;

public interface JudgehostService {
    Object getConfig(String name);

    List<CodeSourceDto> getSubmissionSourceCode(Long contestId, Long submissionId);

    NextJudginDto nextJudging(String judgehostName);

    void updateJudging(String judgehostName, Long judgingId, UpdateJudgingDto updateJudgingDto);

    String getInputTestCaseId(Long testCaseId);

    String getOutputTestCaseId(Long testCaseId);

    List<JudgehostsDto> registerJudgehosts();
}
