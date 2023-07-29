package lkdcode.class4.app.domain.controller;

import lkdcode.class4.app.domain.service.PointService;

public class SNSController {

    private final PointService pointService;

    public SNSController(PointService pointService) {
        this.pointService = pointService;
    }

    public void calculator() {
        pointService.calculatorFriendList();
        pointService.calculatorVisitorList();
        pointService.showList();
    }

}