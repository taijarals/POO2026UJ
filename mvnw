#!/bin/sh
# Maven Wrapper (versão simplificada para o Codespace).
# Baixa, uma única vez, a versão do Maven definida em
# .mvn/wrapper/maven-wrapper.properties e executa o comando pedido.
# Uso: ./mvnw spring-boot:run   |   ./mvnw test
set -e

BASE_DIR=$(cd "$(dirname "$0")" && pwd)
PROPS="$BASE_DIR/.mvn/wrapper/maven-wrapper.properties"
URL=$(sed -n 's/^distributionUrl=//p' "$PROPS" | tr -d '\r')
NAME=$(basename "$URL" -bin.zip)
DEST="${MAVEN_USER_HOME:-$HOME/.m2}/wrapper/dists/$NAME"

if [ ! -x "$DEST/bin/mvn" ]; then
    echo "Baixando $NAME (só acontece na primeira vez)..."
    TMP="$DEST.tmp"
    rm -rf "$TMP"
    mkdir -p "$TMP"
    curl -fsSL "$URL" -o "$TMP/maven.zip"
    if command -v unzip >/dev/null 2>&1; then
        unzip -q "$TMP/maven.zip" -d "$TMP"
    else
        (cd "$TMP" && jar xf maven.zip)
    fi
    rm -rf "$DEST"
    mv "$TMP/$NAME" "$DEST"
    rm -rf "$TMP"
    chmod +x "$DEST/bin/mvn"
fi

cd "$BASE_DIR"
exec "$DEST/bin/mvn" "$@"
