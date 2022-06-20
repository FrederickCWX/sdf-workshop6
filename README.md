## Server

```
mvn compile exec:java -Dexec.mainClass="vttp2022.workshop6.server.ServerApp" -Dexec.args="12345 /Users/zafian/development/sdf-workshop6/cookie_file.txt"
```

## Client


```
mvn compile exec:java -Dexec.mainClass="vttp2022.workshop6.client.ClientApp" -Dexec.args="0.0.0.0:12345"
```