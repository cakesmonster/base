package com.cakemonster.admin.enums;

import lombok.Getter;

/**
 * UserEnableEnum
 *
 * @author cakemonster
 * @date 2024/6/9
 */
@Getter
public enum UserEnableEnum {
    ENABLE(1, true),
    DISABLE(0, false);

    private final Integer enable;

    private final Boolean status;

    UserEnableEnum(Integer enable, Boolean status) {
        this.enable = enable;
        this.status = status;
    }

    public static boolean parse(Integer enable) {
        for (UserEnableEnum userEnableEnum : UserEnableEnum.values()) {
            if (userEnableEnum.getEnable().equals(enable)) {
                return userEnableEnum.status;
            }
        }
        return false;
    }

}
