package com.example.spring.consumer.amqp;

public interface AmqpConsumer<T> {

    public void consumer(T t);
}
