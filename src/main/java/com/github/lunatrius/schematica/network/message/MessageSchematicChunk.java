package com.github.lunatrius.schematica.network.message;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageSchematicChunk implements IMessage, IMessageHandler<MessageSchematicChunk, IMessage> {
    @Override
    public void fromBytes(ByteBuf buf) {
        // TODO: implement
    }

    @Override
    public void toBytes(ByteBuf buf) {
        // TODO: implement
    }

    @Override
    public IMessage onMessage(MessageSchematicChunk message, MessageContext ctx) {
        // TODO: implement
        return null;
    }
}