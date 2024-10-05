/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.outbox.test.quarkus.remote;

import java.util.Objects;

public record DebeziumConnectorStatus(String name, Connector connector) {
    private static final String RUNNING_STATE = "RUNNING";

    public DebeziumConnectorStatus {
        Objects.requireNonNull(name);
        Objects.requireNonNull(connector);
    }

    public Boolean isRunning() {
        return RUNNING_STATE.equals(this.connector.state());
    }

}
