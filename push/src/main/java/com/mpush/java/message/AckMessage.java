package com.mpush.java.message;

import com.mpush.java.api.connection.Connection;
import com.mpush.java.api.protocol.Command;
import com.mpush.java.api.protocol.Packet;
import com.mpush.java.util.ByteBuf;

import java.nio.ByteBuffer;

/**
 * Created by ohun on 16/9/5.
 *
 * @author ohun@live.cn (夜色)
 */
public class AckMessage extends ByteBufMessage {

    public AckMessage(int sessionId, Connection connection) {
        super(new Packet(Command.ACK, sessionId), connection);
    }

    public AckMessage(Packet packet, Connection connection) {
        super(packet, connection);
    }

    @Override
    protected void decode(ByteBuffer body) {

    }

    @Override
    protected void encode(ByteBuf body) {

    }


    public static AckMessage from(BaseMessage src) {
        return new AckMessage(new Packet(Command.ACK, src.getSessionId()), src.connection);
    }

    @Override
    public String toString() {
        return "AckMessage{" +
                "packet=" + packet +
                '}';
    }
}