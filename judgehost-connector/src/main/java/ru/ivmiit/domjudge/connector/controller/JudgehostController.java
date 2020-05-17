package ru.ivmiit.domjudge.connector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/judgehost/api")
public class JudgehostController {

    @PostMapping("/judgehosts")
    public Object judgehosts() {
        return "{\n" +
                "    \"judgingid\": 6,\n" +
                "    \"submitid\": 6,\n" +
                "    \"cid\": 2\n" +
                "  }";
    }
}
