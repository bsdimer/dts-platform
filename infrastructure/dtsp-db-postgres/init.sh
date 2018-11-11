#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE ROLE zabbix WITH LOGIN PASSWORD 'P@ssp0rt';
    CREATE DATABASE zabbix;
    GRANT ALL PRIVILEGES ON DATABASE zabbix TO zabbix;
EOSQL