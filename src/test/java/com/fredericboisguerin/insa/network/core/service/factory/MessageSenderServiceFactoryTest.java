package com.fredericboisguerin.insa.network.core.service.factory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.fredericboisguerin.insa.network.core.service.*;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MessageSenderServiceFactoryTest {

    private MessageSenderServiceFactory networkMessageSenderServiceFactory;
    private UDPMessageSenderService sender ;
    private UDPMessageReceiverService receiver;
    private String textMessage;
    private String ipAddress ;
    private int port;
/*
    @Before
    public void setUp() throws SocketException {
        receiver = mock(UDPMessageReceiverService.class);
        sender = new UDPMessageSenderService();
        textMessage = "Hello";
        port = 1234;
        ipAddress = "205.205.205.205";
        networkMessageSenderServiceFactory = new MessageSenderServiceFactory();

    }

    @Test
    public void should_build_message_sender_TCP() throws Exception {
        MessageSenderService messageSenderService = networkMessageSenderServiceFactory.onTCP();

        assertThat(messageSenderService).isInstanceOf(TCPMessageSenderService.class);
    }

    @Test
    public void should_build_message_sender_UDP() throws Exception {

        MessageSenderService messageSenderService = networkMessageSenderServiceFactory.onUDP();

        assertThat(messageSenderService).isInstanceOf(UDPMessageSenderService.class);
        verify(receiver).listenOnPort(port);
    }
    */
}