package org.zstack.header.network.l3;

import org.zstack.header.query.APIQueryMessage;
import org.zstack.header.query.AutoQuery;

@AutoQuery(replyClass = APIQueryIpRangeReply.class, inventoryClass = IpRangeInventory.class)
public class APIQueryIpRangeMsg extends APIQueryMessage {

}
