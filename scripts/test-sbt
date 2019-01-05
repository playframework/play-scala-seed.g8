#!/usr/bin/env bash

. "$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )/script-helper"

echo "+----------------------------+"
echo "| Executing tests using sbt  |" 
echo "+----------------------------+"

## This runs the template with the default parameters, and runs test within the templated app.
rm -rf src/main/g8/test # https://github.com/sbt/sbt/issues/630
sbt -Dfile.encoding=UTF8 -J-XX:ReservedCodeCacheSize=256M test g8Test
