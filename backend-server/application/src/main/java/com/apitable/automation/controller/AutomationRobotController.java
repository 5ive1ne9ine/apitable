/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.automation.controller;

import com.apitable.automation.model.AutomationSimpleVO;
import com.apitable.automation.model.AutomationVO;
import com.apitable.automation.service.IAutomationRobotService;
import com.apitable.core.support.ResponseData;
import com.apitable.shared.component.scanner.annotation.ApiResource;
import com.apitable.shared.component.scanner.annotation.GetResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Automation robots controller.
 */
@RestController
@Tag(name = "Automation robots")
@ApiResource(path = {"/automation/robots"})
@Slf4j
public class AutomationRobotController {

    @Resource
    private IAutomationRobotService iAutomationRobotService;

    /**
     * Get automation robots.
     *
     * @param resourceId resource id
     * @return {@link ResponseData}
     */
    @GetResource(path = "", requiredPermission = false)
    @Operation(summary = "Get automation robots")
    @Parameter(name = "resourceId", description = "resource id", required = true,
        schema = @Schema(type = "string"), in = ParameterIn.QUERY, example = "dst****")
    @ApiResponses(@ApiResponse(responseCode = "200", useReturnTypeSchema = true))
    public ResponseData<List<AutomationSimpleVO>> getResourceRobots(
        @RequestParam(name = "resourceId") String resourceId) {
        List<AutomationSimpleVO> result = iAutomationRobotService.getRobotsByResourceId(resourceId);
        return ResponseData.success(result);
    }

    @GetResource(path = "/{resourceId}", requiredPermission = false)
    @Operation(summary = "Get node automation detail. ")
    @Parameter(name = "resourceId", description = "node id", required = true, schema = @Schema(type = "string"), in = ParameterIn.QUERY, example = "aut****")
    @ApiResponses(@ApiResponse(responseCode = "200", useReturnTypeSchema = true))
    public ResponseData<AutomationVO> getNodeRobot(@PathVariable String resourceId) {
        return ResponseData.success(iAutomationRobotService.getRobotByResourceId(resourceId));
    }
}
