package org.zstack.header.console;

import org.zstack.header.core.ReturnValueCompletion;
import org.zstack.header.identity.SessionInventory;
import org.zstack.header.vm.VmInstanceInventory;

/**
 * Created with IntelliJ IDEA.
 * User: frank
 * Time: 12:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ConsoleBackend {
    String getConsoleBackendType();

    void grantConsoleAccess(SessionInventory session, VmInstanceInventory vm, ReturnValueCompletion<ConsoleInventory> complete);
}
