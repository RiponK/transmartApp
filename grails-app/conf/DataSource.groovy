//dataSource {
//	driverClassName ="oracle.jdbc.driver.OracleDriver"
//	url = "jdbc:oracle:thin:@10.118.255.3:1521:tm12"
//	//url = "jdbc:oracle:thin:@localhost:1521:tsmrt"
//	username        = "biomart_user"
//	password        = "biomart_user"
//	dialect = "org.hibernate.dialect.Oracle10gDialect"
//	pooled = true
//	logSql = true
//	formatSql = true
//}
dataSource {
    driverClassName = "org.postgresql.Driver"
    url             = "jdbc:postgresql://localhost:55434/transmart"
    username        = "biomart_user"
    password        = "biomart_user"
    dialect         = "org.hibernate.dialect.PostgreSQLDialect"
    dbCreate        = 'none'
}

dataSource_tmcz {
    driverClassName = "org.postgresql.Driver"
    url             = "jdbc:postgresql://localhost:55434/transmart"
    username        = "tm_cz"
    password        = "tm_cz"
    dialect         = "org.hibernate.dialect.PostgreSQLDialect"
    dbCreate        = 'none'
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache        = true
    cache.provider_class         = 'org.hibernate.cache.EhCacheProvider'
}

environments {
    development {
        dataSource {
            logSql    = true
            formatSql = true
             properties {
                maxActive   = 10
                maxIdle     = 5
                minIdle     = 2
                initialSize = 2
            }
        }
    }
    production {
        dataSource {
            logSql    = true
            formatSql = true
             properties {
                maxActive   = 50
                maxIdle     = 25
                minIdle     = 5
                initialSize = 5
            }
        }
    }
}
