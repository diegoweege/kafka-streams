package br.com.kafka.streams.kafkastreams.consumer;

import java.util.function.Function;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LojaNovoPedidoConfiguration {

    @Bean("loja-novo-pedido")
    public Function<KStream<String, String>, KStream<String, String>> execute() {
        return stream -> stream.map((key, value) -> new KeyValue<>(key, value), Named.as("loja-novo-pedido"));
    }
}
