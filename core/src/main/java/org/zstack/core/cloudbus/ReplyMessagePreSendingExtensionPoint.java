package org.zstack.core.cloudbus;

import org.zstack.header.message.Message;
import org.zstack.header.message.NeedReplyMessage;

import java.util.List;

/**
 */
public interface ReplyMessagePreSendingExtensionPoint {
    List<Class> getReplyMessageClassForPreSendingExtensionPoint();

    // When "replyOrEvent" is an event, then the second argument "msg" will be null.
    void marshalReplyMessageBeforeSending(Message replyOrEvent, NeedReplyMessage msg);
}
