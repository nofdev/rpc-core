package org.nofdev.exception

import groovy.transform.InheritConstructors
import org.nofdev.servicefacade.AbstractBusinessException

/**
 * Created by Liutengfei on 2016/4/21 0021.
 */
@InheritConstructors
class AuthorizationException extends AbstractBusinessException {
    static String DEFAULT_EXCEPTION_MESSAGE = "授权失败异常"

    AuthorizationException() {
        super(DEFAULT_EXCEPTION_MESSAGE)
    }
}
