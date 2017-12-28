environments {
    stage { // 开发环境
        database {
            url = 'jdbc:hsqldb:data/weather/stage'
        }
    }
    publish { // 线上环境
        database {
            url = 'jdbc:hsqldb:data/weather'
        }
    }
}