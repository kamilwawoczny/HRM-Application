package com.paw.hrmApp.controller;

import com.paw.hrmApp.configuration.SpringFoxConfig;
import com.paw.hrmApp.dto.EmployeeHistoryDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Api(tags = { SpringFoxConfig.employeeHistory })
public class EmployeeHistoryController {
    @ApiOperation(value = "Returns list of all archived employees")
    @GetMapping("/employee-history")
    private List<EmployeeHistoryDTO> getEmployeeHistory() {
        List<EmployeeHistoryDTO> employeeHistoryDTO = new ArrayList<>();
        employeeHistoryDTO.add(EmployeeHistoryDTO.builder().build());
        return employeeHistoryDTO;
    }

    @ApiOperation(value = "Returns specific archived employee")
    @GetMapping("/employee-history/{id}")
    private EmployeeHistoryDTO getSpecificEmployeeHistory(@ApiParam(value = "Id of archived employee", example = "1", required = true) @PathVariable Long id) {
        EmployeeHistoryDTO employeeHistoryDTO = EmployeeHistoryDTO.builder().build();
        employeeHistoryDTO.setEmployeeId(id);
        return employeeHistoryDTO;
    }

    @ApiOperation(value = "Returns statistics from specific month")
    @GetMapping("/employee-history/statistic/{month}")
    private Map<String, Integer> getStatistics(@ApiParam(value = "Month in which statistics should be made", example = "July", required = true) @PathVariable String month) {
        return new HashMap<>();
    }

    @ApiOperation(value = "Delete specific employee from history")
    @DeleteMapping("/employee-history/{id}")
    private void deleteEmployeeHistory(@ApiParam(value = "Id of archived employees", example = "1", required = true) @PathVariable Long id) {

    }
}
