# spider-java

Crawl GitHub APIs and store the discovered orgs, repos, commits...

## Run in terminal

``` bash
gradle build && java -jar build/libs/spider.jar
# or just run gradle run
```

### Run in docker

``` bash
gradle jibDockerBuild
docker run -it --rm spider-java:latest
```
