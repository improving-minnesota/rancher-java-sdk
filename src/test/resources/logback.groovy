import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.WARN

appender('STDOUT', ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = '%d{HH:mm:ss.SSS} [%thread] %-5level %logger - %msg%n'
  }
}

root(INFO, ['STDOUT'])

logger('org.testcontainers', INFO)
logger('org.apache.http', WARN)
logger('com.github.dockerjava', WARN)
logger('org.zeroturnaround.exec', WARN)
